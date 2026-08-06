package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lf4 implements wfb {
    public final FrameLayout a;
    public final MaterialTextView b;
    public final FrameLayout c;
    public final PlayerView d;

    public lf4(FrameLayout frameLayout, MaterialTextView materialTextView, FrameLayout frameLayout2, PlayerView playerView) {
        this.a = frameLayout;
        this.b = materialTextView;
        this.c = frameLayout2;
        this.d = playerView;
    }

    public static lf4 bind(View view) {
        int i = R.id.playerErrorPlaceholder;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.playerErrorPlaceholder, view);
        if (materialTextView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            PlayerView playerView = (PlayerView) nt3.b(R.id.videoView, view);
            if (playerView != null) {
                return new lf4(frameLayout, materialTextView, frameLayout, playerView);
            }
            i = R.id.videoView;
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static lf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_player, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static lf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
