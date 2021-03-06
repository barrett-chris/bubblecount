package ca.chrisbarrett.bubblecount.view.game.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * All drawable sprites must implement
 *
 * @author Chris Barrett
 * @since Jun 29, 2016
 */
public interface Sprite {

    /**
     * Gets the X coordinate of the Sprite
     *
     * @return the X coordinate
     */
    float getX ();

    /**
     * Sets the X coordinate of the Sprite
     *
     * @param x the X coordinate value
     */
    void setX (float x);

    /**
     * Gets the Y coordinate of the Sprite
     *
     * @return the Y coordinate
     */
    float getY ();

    /**
     * Sets the Y coordinate of the Sprite
     *
     * @param y the Y coordinate value
     */
    void setY (float y);

    /**
     * Gets the Y speed of the sprite
     *
     * @return the Y direction speed
     */
    float getYSpeed ();

    /**
     * Sets the Y speed of the sprite
     *
     * @param x the Y direction speed
     */
    void setYSpeed (float x);

    /**
     * Gets the X speed of the sprite
     *
     * @return the X direction speed
     */
    float getXSpeed ();

    /**
     * Sets the X speed of the sprite
     *
     * @param x the X direction speed
     */
    void setXSpeed (float x);

    /**
     * Gets the radius of the Sprite
     *
     * @return radius
     */
    float getRadius ();

    /**
     * Sets the radius of the Sprite
     *
     * @param radius of the Sprite
     */
    void setRadius (float radius);

    /**
     * Gets the text of the Sprite
     *
     * @return String object containing text. This object can be null.
     */
    String getText ();

    /**
     * Sets the text of the Sprite
     *
     * @param text of the Sprite
     */
    void setText (String text);

    /**
     * Gets the visibility state of the Sprite
     */
    boolean getVisibility ();

    /**
     * Sets the visibility of the Sprite
     *
     * @param isVisible
     */
    void setVisibility (boolean isVisible);

    /**
     * Checks to see if the Sprite has collided with another Sprite object
     *
     * @param sprite Sprite object to be checked against
     * @return true if the Sprites have collided
     */
    boolean isCollision (Sprite sprite);

    /**
     * Checks to see if the Sprite has collided with a specific point
     *
     * @param x the X coordinate of the touch
     * @param y the Y coordinate of the touch
     * @return true if the Sprite has been touched, false if it has not been touched
     */
    boolean isCollision (float x, float y);

    /**
     * Gets the rectangle dimensions of the portion of the sprite image to display
     *
     * @return a Rect object
     */
    Rect getWhatToDraw ();

    /**
     * Gets the rectangle dimensions of where to draw the image
     *
     * @return a Rect object
     */
    RectF getWhereToDraw ();

    /**
     * Gets the sprite image
     *
     * @return the Bitmap of the sprite
     */
    Bitmap getSpriteImage ();

    /**
     * Sets the sprite image
     *
     * @param spriteImage the Bitmap of the sprite
     */
    void setSpriteImage (SpriteImage spriteImage);

    /**
     * Updates the Sprite, such as with motion. Usually called prior to a draw event.
     *
     * @return true if the sprite has expired
     */
    boolean update ();

    /**
     * Animates the Sprite
     */
    void animate ();

    /**
     * Defines what happens to this sprite is touched
     */
    void touched (Sprite sprite);

    /**
     * Draws the sprite if the sprite is visible
     *
     * @param canvas    the canvas to draw on
     * @param drawPaint the paintbrush to use for images
     * @param textPaint the paintbrush to use for text
     */
    void draw (Canvas canvas, Paint drawPaint, Paint textPaint);
}
