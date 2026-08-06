package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yx5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yx5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                hw5 hw5VarInvoke = ((ay5) obj2).H.invoke();
                int iB = hw5VarInvoke.b();
                int i2 = 0;
                while (i2 < iB) {
                    if (hw5VarInvoke.f(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            case 1:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return serialDescriptor.g(iIntValue) + ": " + serialDescriptor.i(iIntValue).a();
            default:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                ((la6) yaVar.u).b.setText(((jo8) yaVar.t()).b);
                return g2b.a;
        }
    }
}
