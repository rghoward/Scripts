package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hl3 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ hl3 u = new hl3();

    public static final void b(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.g(i4));
            }
            i3 >>>= 1;
        }
        String strA = serialDescriptor.a();
        strA.getClass();
        throw new mv6(arrayList.size() == 1 ? ao2.a(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null, arrayList, strA);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return u4c.u.get().x();
    }
}
