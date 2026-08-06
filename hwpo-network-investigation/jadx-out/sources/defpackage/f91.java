package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f91 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = m91.I;
                return ((n91) obj).e;
            default:
                if (xj5.a(obj, Boolean.FALSE)) {
                    return new vf7(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj3 = list.get(1);
                Float f2 = obj3 != null ? (Float) obj3 : null;
                f2.getClass();
                return new vf7((((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32));
        }
    }
}
