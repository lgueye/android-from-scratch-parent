/*
 *
 */
package org.diveintojee.poc.androidfromscratch;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

/**
 * @author louis.gueye@gmail.com
 */
public class AndroidFromScratchMarkers extends ItemizedOverlay<OverlayItem> {

    private final List<OverlayItem> overlayItems = new ArrayList<OverlayItem>();
    private final Context context;

    /**
     * @param defaultMarker
     */
    public AndroidFromScratchMarkers(final Drawable defaultMarker, final Context context) {
        super(boundCenterBottom(defaultMarker));
        this.context = context;
    }

    /**
     * @param overlayItem
     */
    public void addOverlayItem(final OverlayItem overlayItem) {
        overlayItems.add(overlayItem);
        populate();
    }

    /**
     * @see com.google.android.maps.ItemizedOverlay#createItem(int)
     */
    @Override
    protected OverlayItem createItem(final int itemIndex) {
        return overlayItems.get(itemIndex);
    }

    /**
     * @see com.google.android.maps.ItemizedOverlay#onTap(int)
     */
    @Override
    protected boolean onTap(final int index) {
        final OverlayItem item = overlayItems.get(index);
        final StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("** " + item.getTitle() + " **");
        messageBuilder.append("\n");
        messageBuilder.append(item.getSnippet());
        Toast.makeText(context, messageBuilder.toString(), Toast.LENGTH_LONG).show();
        return true;
    }

    /**
     * @see com.google.android.maps.ItemizedOverlay#size()
     */

    @Override
    public int size() {
        return overlayItems.size();
    }

}
