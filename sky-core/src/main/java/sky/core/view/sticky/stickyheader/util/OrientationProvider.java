package sky.core.view.sticky.stickyheader.util;

import android.support.v7.widget.RecyclerView;

/**
 * Interface for getting the orientation of a RecyclerView from its
 * LayoutManager
 */
public interface OrientationProvider {

	int getOrientation(RecyclerView recyclerView);

	boolean isReverseLayout(RecyclerView recyclerView);
}
