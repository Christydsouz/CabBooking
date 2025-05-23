package com.example.cabbooking.model.GoogleMaps;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

/**
 * A CustomClusterItemRender to apply custom icon and clustering rule.
 */
public class CustomClusterItemRender extends DefaultClusterRenderer<MyClusterItem> {
    public CustomClusterItemRender(Context context, GoogleMap map, ClusterManager<MyClusterItem> clusterManager) {
        super(context, map, clusterManager);
    }

    @Override
    protected void onBeforeClusterItemRendered(@NonNull MyClusterItem item, @NonNull MarkerOptions markerOptions) {
        markerOptions.icon(item.getIconBitMapDescriptor());
        super.onBeforeClusterItemRendered(item, markerOptions);
    }

    @Override
    protected boolean shouldRenderAsCluster(@NonNull Cluster<MyClusterItem> cluster) {
        return cluster.getSize() > 1;
    }
}
