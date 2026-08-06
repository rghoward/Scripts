package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.e;
import androidx.fragment.app.g;
import com.hwpo_training_app.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class btb extends e {
    public final vg4 J;
    public int K;
    public static final /* synthetic */ ho5<Object>[] L = {new ne8(btb.class, "binding", "getBinding()Lcom/hwpo_training_app/youtube_player/databinding/YoutubePlayerFragmentBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static btb a(String str) {
            str.getClass();
            btb btbVar = new btb();
            btbVar.setArguments(uy0.c(new js7("com.hwpo_training_app.youtube_player.dialog.YoutubePlayerFragment.VIDEO_ID_KEY", str)));
            return btbVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<btb, etb> {
        @Override // defpackage.oh4
        public final etb invoke(btb btbVar) {
            btb btbVar2 = btbVar;
            btbVar2.getClass();
            return etb.bind(btbVar2.requireView());
        }
    }

    public btb() {
        super(R.layout.youtube_player_fragment);
        this.J = new vg4(new b());
        this.K = 1;
    }

    @Override // androidx.fragment.app.e
    public final int l() {
        return R.style.PlayerDialog;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        YouTubePlayerView youTubePlayerView;
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView != null && (youTubePlayerView = (YouTubePlayerView) viewOnCreateView.findViewById(R.id.youtubePlayer)) != null) {
            s66 lifecycle = getLifecycle();
            lifecycle.getClass();
            lifecycle.a(youTubePlayerView);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onDestroyView() {
        super.onDestroyView();
        g activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.K);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        View decorView;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = this.E;
        if (dialog != null && (window2 = dialog.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            ee5.b(decorView, new vj1(1, this));
            g2b g2bVar = g2b.a;
        }
        Dialog dialog2 = this.E;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            window.setLayout(-1, -1);
        }
        g activity = getActivity();
        this.K = activity != null ? activity.getRequestedOrientation() : 1;
        g activity2 = getActivity();
        if (activity2 != null) {
            activity2.setRequestedOrientation(13);
        }
        etb etbVar = (etb) this.J.a(this, L[0]);
        xgb.a(etbVar.b, new ctb(this, null));
        YouTubePlayerView youTubePlayerView = etbVar.d;
        dtb dtbVar = new dtb(this, etbVar);
        elb youTubePlayer$youtube_player = youTubePlayerView.t.getYouTubePlayer$youtube_player();
        youTubePlayer$youtube_player.getClass();
        youTubePlayer$youtube_player.u.add(dtbVar);
    }
}
