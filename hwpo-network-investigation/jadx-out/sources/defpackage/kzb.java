package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kzb extends jzb {
    public static final Map d;
    public final r9d c;

    static {
        EnumMap enumMap = new EnumMap(r9d.class);
        for (r9d r9dVar : r9d.values()) {
            kzb[] kzbVarArr = new kzb[10];
            for (int i = 0; i < 10; i++) {
                kzbVarArr[i] = new kzb(i, r9dVar, x9d.e);
            }
            enumMap.put(r9dVar, kzbVarArr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    public kzb(int i, r9d r9dVar, x9d x9dVar) {
        super(x9dVar, i);
        qzb.a(r9dVar, "format char");
        this.c = r9dVar;
        if (x9dVar.a()) {
            return;
        }
        int i2 = r9dVar.t;
        i2 = x9dVar.c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        x9dVar.d(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.jzb
    public final void a(q9d q9dVar, Object obj) {
        q9dVar.d(obj, this.c, this.b);
    }
}
