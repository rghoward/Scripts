package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f80 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final q70 d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int a;
        public q70 b;
        public boolean c;
        public boolean d;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements AudioManager.OnAudioFocusChangeListener {
        public final Handler a;
        public final AudioManager.OnAudioFocusChangeListener b;

        public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.b = onAudioFocusChangeListener;
            Looper looper = handler.getLooper();
            String str = n6b.a;
            this.a = new Handler(looper, null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            n6b.R(this.a, new Runnable() { // from class: g80
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.b.onAudioFocusChange(i);
                }
            });
        }
    }

    public f80(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, q70 q70Var, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = q70Var;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(q70Var.a()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f80)) {
            return false;
        }
        f80 f80Var = (f80) obj;
        return this.a == f80Var.a && this.e == f80Var.e && Objects.equals(this.b, f80Var.b) && Objects.equals(this.c, f80Var.c) && Objects.equals(this.d, f80Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
