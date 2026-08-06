package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d39 {
    public static final au3 a = new au3(new v29(0), new w29(0));
    public static final au3 b = new au3(new x29(), new cp0(1));
    public static final au3 c = new au3(new y29(), new ep0(2));
    public static final au3 d = new au3(new z29(), new oh4() { // from class: a39
        public final /* synthetic */ int t = 0;

        @Override // defpackage.oh4
        public final Object invoke(Object obj) {
            switch (this.t) {
                case 0:
                    obj.getClass();
                    List list = (List) obj;
                    Object obj2 = list.get(0);
                    jja.a aVar = (xj5.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (jja.a) ((oh4) d39.e.u).invoke(obj2);
                    aVar.getClass();
                    int i = aVar.a;
                    Object obj3 = list.get(1);
                    Boolean bool = obj3 != null ? (Boolean) obj3 : null;
                    bool.getClass();
                    return new jja(i, bool.booleanValue());
                default:
                    onb onbVar = (onb) obj;
                    onbVar.getClass();
                    return onbVar;
            }
        }
    });
    public static final au3 e = new au3(new b39(), new c39(0));
}
