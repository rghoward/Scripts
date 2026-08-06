package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.media3.ui.PlayerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f9 implements wfb {
    public final FrameLayout a;
    public final SimpleProgressBar b;
    public final FragmentContainerView c;
    public final PlayerView d;
    public final FrameLayout e;

    public f9(FrameLayout frameLayout, SimpleProgressBar simpleProgressBar, FragmentContainerView fragmentContainerView, PlayerView playerView, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = simpleProgressBar;
        this.c = fragmentContainerView;
        this.d = playerView;
        this.e = frameLayout2;
    }

    public static f9 bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.progress;
        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
        if (simpleProgressBar != null) {
            i = R.id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) nt3.b(R.id.rootContainer, view);
            if (fragmentContainerView != null) {
                i = R.id.splashScreenPlayer;
                PlayerView playerView = (PlayerView) nt3.b(R.id.splashScreenPlayer, view);
                if (playerView != null) {
                    i = R.id.statusBarColor;
                    FrameLayout frameLayout2 = (FrameLayout) nt3.b(R.id.statusBarColor, view);
                    if (frameLayout2 != null) {
                        return new f9(frameLayout, simpleProgressBar, fragmentContainerView, playerView, frameLayout2);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static f9 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_host, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static f9 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
