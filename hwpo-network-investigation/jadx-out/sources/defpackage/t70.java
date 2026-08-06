package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.exoplayer.d;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t70 {
    public final Context a;
    public final a b;
    public final kt4 c;
    public boolean d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends BroadcastReceiver {
        public final b a;
        public final kt4 b;

        public a(kt4 kt4Var, b bVar) {
            this.b = kt4Var;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.e(new Runnable() { // from class: s70
                    @Override // java.lang.Runnable
                    public final void run() {
                        t70.a aVar = this.t;
                        if (t70.this.d) {
                            ((d.b) aVar.a).t.B0(3, false);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
    }

    public t70(Context context, Looper looper, Looper looper2, b bVar, z7a z7aVar) {
        this.a = context.getApplicationContext();
        this.c = z7aVar.b(looper, null);
        this.b = new a(z7aVar.b(looper2, null), bVar);
    }

    public final void a() {
        if (this.d) {
            this.c.e(new Runnable() { // from class: r70
                @Override // java.lang.Runnable
                public final void run() {
                    t70 t70Var = this.t;
                    t70Var.a.unregisterReceiver(t70Var.b);
                }
            });
            this.d = false;
        }
    }
}
