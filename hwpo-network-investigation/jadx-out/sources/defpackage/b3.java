package defpackage;

import androidx.fragment.app.i;
import com.google.firebase.abt.component.AbtRegistrar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements qq1, mb2 {
    public static /* synthetic */ int b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.qq1
    public Object a(xu8 xu8Var) {
        return AbtRegistrar.lambda$getComponents$0(xu8Var);
    }

    @Override // defpackage.mb2
    public Object c(i iVar) {
        iVar.getClass();
        return new oc4();
    }
}
