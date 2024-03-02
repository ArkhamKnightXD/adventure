package knight.arkham.helpers;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AnimationBody {
    private final TextureRegion region;
    private final int frameWidth;
    private final int frameHeight;
    private final int totalFrames;
    private final float frameDuration;

    public AnimationBody(TextureRegion region, int frameWidth, int frameHeight, int totalFrames, float frameDuration) {
        this.region = region;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.totalFrames = totalFrames;
        this.frameDuration = frameDuration;
    }

    public Animation<TextureRegion> getAnimation() {

        Array<TextureRegion> animationFrames = new Array<>();

        for (int i = 0; i < totalFrames; i++)
            animationFrames.add(new TextureRegion(region, i * frameWidth, 0, frameWidth, frameHeight));

        return new Animation<>(frameDuration, animationFrames);
    }
}
