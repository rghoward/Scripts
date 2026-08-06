package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ mj(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    @Override // defpackage.mh4
    public final Object invoke() {
        float fG;
        si8 si8VarA;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                wj wjVar = (wj) obj;
                float fD = wjVar.e().d(wjVar.g.getValue());
                float fD2 = wjVar.e().d(wjVar.i.getValue()) - fD;
                float fAbs = Math.abs(fD2);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fG = 1.0f;
                } else {
                    fG = (wjVar.g() - fD) / fD2;
                    if (fG < 1.0E-6f) {
                        fG = 0.0f;
                    } else if (fG > 0.999999f) {
                        fG = 1.0f;
                    }
                }
                return Float.valueOf(fG);
            default:
                wq9 wq9Var = wq9.a;
                Context context = ((b85.a) obj).a;
                synchronized (wq9Var) {
                    try {
                        si8VarA = wq9.b;
                        if (si8VarA == null) {
                            i13.a aVar = new i13.a();
                            Bitmap.Config[] configArr = v.a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileC = vy3.c(cacheDir);
                            String str = du7.u;
                            aVar.a = du7.a.b(fileC);
                            si8VarA = aVar.a();
                            wq9.b = si8VarA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return si8VarA;
        }
    }
}
