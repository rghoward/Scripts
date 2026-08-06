package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class elb extends WebView implements rrb, dsb.a {
    public lz1 t;
    public final HashSet<fsb> u;
    public final Handler v;
    public boolean w;

    public elb(Context context) {
        super(context, null, 0);
        this.u = new HashSet<>();
        this.v = new Handler(Looper.getMainLooper());
    }

    @Override // dsb.a
    public final void a() {
        lz1 lz1Var = this.t;
        if (lz1Var != null) {
            lz1Var.invoke(this);
        } else {
            xj5.e("youTubePlayerInitListener");
            throw null;
        }
    }

    @Override // defpackage.rrb
    public final void b() {
        this.v.post(new Runnable() { // from class: ykb
            @Override // java.lang.Runnable
            public final void run() {
                this.t.loadUrl("javascript:pauseVideo()");
            }
        });
    }

    @Override // defpackage.rrb
    public final void c(final String str, final float f) {
        str.getClass();
        this.v.post(new Runnable() { // from class: clb
            @Override // java.lang.Runnable
            public final void run() {
                this.t.loadUrl("javascript:cueVideo('" + str + "', " + f + ")");
            }
        });
    }

    @Override // defpackage.rrb
    public final boolean d(x2 x2Var) {
        return this.u.add(x2Var);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.u.clear();
        this.v.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // defpackage.rrb
    public final boolean e(x2 x2Var) {
        return this.u.remove(x2Var);
    }

    @Override // defpackage.rrb
    public final void f(final String str, final float f) {
        str.getClass();
        this.v.post(new Runnable() { // from class: blb
            @Override // java.lang.Runnable
            public final void run() {
                this.t.loadUrl("javascript:loadVideo('" + str + "', " + f + ")");
            }
        });
    }

    @Override // dsb.a
    public Collection<fsb> getListeners() {
        Collection<fsb> collectionUnmodifiableCollection = Collections.unmodifiableCollection(new HashSet(this.u));
        collectionUnmodifiableCollection.getClass();
        return collectionUnmodifiableCollection;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.w && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public final void setBackgroundPlaybackEnabled$youtube_player(boolean z) {
        this.w = z;
    }

    public void setPlaybackRate(final v28 v28Var) {
        v28Var.getClass();
        this.v.post(new Runnable() { // from class: zkb
            @Override // java.lang.Runnable
            public final void run() {
                int iOrdinal = v28Var.ordinal();
                float f = 1.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f = 0.25f;
                    } else if (iOrdinal == 2) {
                        f = 0.5f;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            f = 1.5f;
                        } else {
                            if (iOrdinal != 5) {
                                u.b();
                                return;
                            }
                            f = 2.0f;
                        }
                    }
                }
                this.t.loadUrl("javascript:setPlaybackRate(" + f + ")");
            }
        });
    }

    public void setVolume(final int i) {
        if (i < 0 || i > 100) {
            z90.a("Volume must be between 0 and 100");
        } else {
            this.v.post(new Runnable() { // from class: alb
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.loadUrl("javascript:setVolume(" + i + ")");
                }
            });
        }
    }

    @Override // dsb.a
    public rrb getInstance() {
        return this;
    }
}
