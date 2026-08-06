package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class avc implements i2d {
    public final boolean a;

    public avc(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i2d
    public final /* bridge */ /* synthetic */ Object a(h2d h2dVar) throws IOException {
        evc evcVarA;
        InputStream inputStreamC = mp0.c(h2dVar);
        try {
            int i = 4096;
            if (this.a) {
                if (inputStreamC instanceof y2d) {
                    long length = ((y2d) inputStreamC).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                evcVarA = evc.a(s0c.h(inputStreamC, i), true);
            } else {
                evcVarA = evc.a(s0c.h(inputStreamC, 4096), false);
            }
            fg1.a(inputStreamC, null);
            return evcVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(inputStreamC, th);
                throw th2;
            }
        }
    }
}
