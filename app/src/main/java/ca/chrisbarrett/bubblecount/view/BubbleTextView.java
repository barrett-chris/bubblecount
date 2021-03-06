package ca.chrisbarrett.bubblecount.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import ca.chrisbarrett.bubblecount.util.FontCache;

/**
 * Generates a custom {@link Button}, using the TypeFace font defined by {@link
 * FontCache#getFont(Context)}. Color will be set to the "colorPrimary" value defined in
 * the color XML file. The button background will be set to the "buttonBackground"value defined in
 * the color XML file.
 *
 * @author Chris Barrett
 * @see android.view.SurfaceView;
 * @since Jun 26, 2016
 */
public class BubbleTextView extends Button {

    public BubbleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontCache.getFont(context));
    }
}
