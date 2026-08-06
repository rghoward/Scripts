package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ kg(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.t) {
            case 0:
                pg.b bVar = pg.Companion;
                z = ((eh) obj).h;
                break;
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new l86.b(str, (xj5.a(obj3, Boolean.FALSE) || obj3 == null) ? null : (fja) ((oh4) t29.j.u).invoke(obj3), null);
            default:
                lj9.a aVar = lj9.Companion;
                z = ((xj9) obj).c;
                break;
        }
        return Boolean.valueOf(z);
    }
}
