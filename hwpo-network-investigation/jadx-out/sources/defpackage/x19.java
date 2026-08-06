package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x19 implements ci4 {
    public final /* synthetic */ int t;

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return Integer.valueOf(((o55) obj2).a);
            default:
                h72.a aVar = (h72.a) obj2;
                if (!(aVar instanceof zka)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? aVar : Integer.valueOf(iIntValue + 1);
        }
    }
}
