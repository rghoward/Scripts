package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dsb {
    public final a a;
    public final Handler b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a();

        rrb getInstance();

        Collection<fsb> getListeners();
    }

    public dsb(a aVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = new Handler(Looper.getMainLooper());
    }

    @JavascriptInterface
    public final void sendApiChange() {
        this.b.post(new Runnable() { // from class: xrb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().c(aVar.getInstance());
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendError(String str) {
        final w28 w28Var;
        str.getClass();
        if (str.equalsIgnoreCase("2")) {
            w28Var = w28.u;
        } else if (str.equalsIgnoreCase("5")) {
            w28Var = w28.v;
        } else if (str.equalsIgnoreCase("100")) {
            w28Var = w28.w;
        } else {
            w28Var = (str.equalsIgnoreCase("101") || str.equalsIgnoreCase("150")) ? w28.x : w28.t;
        }
        this.b.post(new Runnable() { // from class: bsb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().f(aVar.getInstance(), w28Var);
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        final u28 u28Var;
        str.getClass();
        if (str.equalsIgnoreCase("small")) {
            u28Var = u28.u;
        } else if (str.equalsIgnoreCase("medium")) {
            u28Var = u28.v;
        } else if (str.equalsIgnoreCase("large")) {
            u28Var = u28.w;
        } else if (str.equalsIgnoreCase("hd720")) {
            u28Var = u28.x;
        } else if (str.equalsIgnoreCase("hd1080")) {
            u28Var = u28.y;
        } else if (str.equalsIgnoreCase("highres")) {
            u28Var = u28.z;
        } else {
            u28Var = str.equalsIgnoreCase("default") ? u28.A : u28.t;
        }
        this.b.post(new Runnable() { // from class: urb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().i(aVar.getInstance(), u28Var);
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        final v28 v28Var;
        str.getClass();
        if (str.equalsIgnoreCase("0.25")) {
            v28Var = v28.u;
        } else if (str.equalsIgnoreCase("0.5")) {
            v28Var = v28.v;
        } else if (str.equalsIgnoreCase("1")) {
            v28Var = v28.w;
        } else if (str.equalsIgnoreCase("1.5")) {
            v28Var = v28.x;
        } else {
            v28Var = str.equalsIgnoreCase("2") ? v28.y : v28.t;
        }
        this.b.post(new Runnable() { // from class: wrb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().h(aVar.getInstance(), v28Var);
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendReady() {
        this.b.post(new Runnable() { // from class: yrb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().b(aVar.getInstance());
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        final x28 x28Var;
        str.getClass();
        if (str.equalsIgnoreCase("UNSTARTED")) {
            x28Var = x28.u;
        } else if (str.equalsIgnoreCase("ENDED")) {
            x28Var = x28.v;
        } else if (str.equalsIgnoreCase("PLAYING")) {
            x28Var = x28.w;
        } else if (str.equalsIgnoreCase("PAUSED")) {
            x28Var = x28.x;
        } else if (str.equalsIgnoreCase("BUFFERING")) {
            x28Var = x28.y;
        } else {
            x28Var = str.equalsIgnoreCase("CUED") ? x28.z : x28.t;
        }
        this.b.post(new Runnable() { // from class: csb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().e(aVar.getInstance(), x28Var);
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        str.getClass();
        try {
            final float f = Float.parseFloat(str);
            this.b.post(new Runnable() { // from class: srb
                @Override // java.lang.Runnable
                public final void run() {
                    dsb.a aVar = this.t.a;
                    Iterator<fsb> it = aVar.getListeners().iterator();
                    while (it.hasNext()) {
                        it.next().d(aVar.getInstance(), f);
                    }
                }
            });
        } catch (NumberFormatException e) {
            rma.a.b(e);
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        str.getClass();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            final float f = Float.parseFloat(str);
            this.b.post(new Runnable(f) { // from class: vrb
                @Override // java.lang.Runnable
                public final void run() {
                    dsb.a aVar = this.t.a;
                    Iterator<fsb> it = aVar.getListeners().iterator();
                    while (it.hasNext()) {
                        it.next().j(aVar.getInstance());
                    }
                }
            });
        } catch (NumberFormatException e) {
            rma.a.b(e);
        }
    }

    @JavascriptInterface
    public final void sendVideoId(final String str) {
        str.getClass();
        this.b.post(new Runnable() { // from class: asb
            @Override // java.lang.Runnable
            public final void run() {
                dsb.a aVar = this.t.a;
                Iterator<fsb> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    it.next().g(aVar.getInstance(), str);
                }
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        str.getClass();
        try {
            final float f = Float.parseFloat(str);
            this.b.post(new Runnable(f) { // from class: zrb
                @Override // java.lang.Runnable
                public final void run() {
                    dsb.a aVar = this.t.a;
                    Iterator<fsb> it = aVar.getListeners().iterator();
                    while (it.hasNext()) {
                        it.next().a(aVar.getInstance());
                    }
                }
            });
        } catch (NumberFormatException e) {
            rma.a.b(e);
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.b.post(new Runnable() { // from class: trb
            @Override // java.lang.Runnable
            public final void run() {
                this.t.a.a();
            }
        });
    }
}
