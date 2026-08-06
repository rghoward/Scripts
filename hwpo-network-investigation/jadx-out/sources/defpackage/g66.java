package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g66 extends zq9 implements l76 {
    public final elb t;
    public final t97 u;
    public final l28 v;
    public boolean w;
    public mh4<g2b> x;
    public final HashSet<esb> y;
    public boolean z;

    public g66(Context context) {
        super(context, null, 0);
        elb elbVar = new elb(context);
        this.t = elbVar;
        this.u = new t97(context);
        l28 l28Var = new l28();
        this.v = l28Var;
        this.x = new a66(0);
        this.y = new HashSet<>();
        this.z = true;
        addView(elbVar, new FrameLayout.LayoutParams(-1, -1));
        elbVar.d(l28Var);
        b66 b66Var = new b66(this);
        HashSet<fsb> hashSet = elbVar.u;
        hashSet.add(b66Var);
        hashSet.add(new c66(this));
    }

    public final boolean getCanPlay$youtube_player() {
        return this.z;
    }

    public final elb getYouTubePlayer$youtube_player() {
        return this.t;
    }

    @qh7(s66.a.ON_RESUME)
    public final void onResume$youtube_player() {
        this.v.a = true;
        this.z = true;
    }

    @qh7(s66.a.ON_STOP)
    public final void onStop$youtube_player() {
        this.t.b();
        this.v.a = false;
        this.z = false;
    }

    @qh7(s66.a.ON_DESTROY)
    public final void release() {
        elb elbVar = this.t;
        removeView(elbVar);
        elbVar.removeAllViews();
        elbVar.destroy();
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$youtube_player(boolean z) {
        this.w = z;
    }
}
