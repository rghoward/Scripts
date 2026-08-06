package defpackage;

import android.os.SystemClock;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b86 implements ut4 {
    @Override // defpackage.ut4
    public final boolean a(br9 br9Var) {
        s03 s03Var = br9Var.a;
        if ((s03Var instanceof s03.a ? ((s03.a) s03Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        s03 s03Var2 = br9Var.b;
        return (s03Var2 instanceof s03.a ? ((s03.a) s03Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.ut4
    public final boolean b() {
        boolean z;
        synchronized (nw3.a) {
            try {
                int i = nw3.c;
                nw3.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > nw3.d + AudioConstants.TRANSCRIPTION_TIMEOUT_MS) {
                    nw3.c = 0;
                    nw3.d = SystemClock.uptimeMillis();
                    String[] list = nw3.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    nw3.e = list.length < 800;
                }
                z = nw3.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
