package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class etb implements wfb {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final View c;
    public final YouTubePlayerView d;

    public etb(ConstraintLayout constraintLayout, ImageButton imageButton, View view, YouTubePlayerView youTubePlayerView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = view;
        this.d = youTubePlayerView;
    }

    public static etb bind(View view) {
        int i = R.id.closeButton;
        ImageButton imageButton = (ImageButton) nt3.b(R.id.closeButton, view);
        if (imageButton != null) {
            i = R.id.loader;
            View viewB = nt3.b(R.id.loader, view);
            if (viewB != null) {
                i = R.id.youtubePlayer;
                YouTubePlayerView youTubePlayerView = (YouTubePlayerView) nt3.b(R.id.youtubePlayer, view);
                if (youTubePlayerView != null) {
                    return new etb((ConstraintLayout) view, imageButton, viewB, youTubePlayerView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static etb inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.youtube_player_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static etb inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
