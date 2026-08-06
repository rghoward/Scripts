package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iyb extends eyb {
    public static final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ln4 {
    }

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            jyb.class.getName().equals(d());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new a(27);
    }

    public static String d() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.eyb
    public final a a() {
        return b;
    }

    @Override // defpackage.eyb
    public final l4c b() {
        AtomicReference atomicReference = oyb.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            return ((hyb) atomicReference.get()).a("Phlogger");
        }
        for (int i = 7; i >= 0; i--) {
            char cCharAt = "Phlogger".charAt(i);
            if (cCharAt == '$') {
                strReplace = "Phlogger".replace('$', '.');
                break;
            }
            if (cCharAt == '.') {
                break;
            }
        }
        oyb oybVar = new oyb(strReplace);
        if (oyb.c || oyb.d) {
            oybVar.b = new ryb((String) oybVar.a);
        } else if (oyb.e) {
            qyb qybVar = syb.h;
            oybVar.b = new syb((String) oybVar.a, Level.OFF, qybVar.b, qybVar.c);
        } else {
            oybVar.b = null;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = myb.a;
        concurrentLinkedQueue.offer(oybVar);
        if (atomicReference.get() != null) {
            while (true) {
                oyb oybVar2 = (oyb) concurrentLinkedQueue.poll();
                if (oybVar2 == null) {
                    break;
                }
                oybVar2.b = ((hyb) atomicReference.get()).a((String) oybVar2.a);
            }
            oyb.u();
        }
        return oybVar;
    }

    @Override // defpackage.eyb
    public final tyb c() {
        return pyb.b;
    }
}
