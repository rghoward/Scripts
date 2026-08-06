package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ix9 {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final a d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Spatializer$OnSpatializerStateChangedListener {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
            this.a.run();
        }

        public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
            this.a.run();
        }
    }

    public ix9(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerB = context == null ? null : j80.b(context);
        if (audioManagerB == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerB.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        a aVar = new a(runnable);
        this.d = aVar;
        spatializer.addOnSpatializerStateChangedListener(new y90(handler), aVar);
    }

    public final boolean a(q70 q70Var, id4 id4Var) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = id4Var.o;
        int i = id4Var.G;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iR = n6b.r(i);
        if (iR == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iR);
        int i2 = id4Var.H;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(q70Var.a(), channelMask.build());
    }

    public final List<Integer> b() {
        if (this.a == null || !this.b || !c() || !d()) {
            k95.b bVar = k95.u;
            return ul8.x;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return k95.v(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        a aVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (aVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(aVar);
        handler.removeCallbacksAndMessages(null);
    }
}
