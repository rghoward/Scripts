package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class izb extends jzb {
    public final hzb c;

    public izb(x9d x9dVar, int i, hzb hzbVar) {
        super(x9dVar, i);
        this.c = hzbVar;
        StringBuilder sb = new StringBuilder("%");
        x9dVar.d(sb);
        sb.append(true != x9dVar.c() ? 't' : 'T');
        sb.append(hzbVar.t);
    }

    @Override // defpackage.jzb
    public final void a(q9d q9dVar, Object obj) {
        StringBuilder sb = q9dVar.e;
        boolean z = obj instanceof Date;
        hzb hzbVar = this.c;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char c = hzbVar.t;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            q9d.e(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        x9d x9dVar = this.b;
        x9dVar.d(sb3);
        sb3.append(true != x9dVar.c() ? 't' : 'T');
        sb3.append(hzbVar.t);
        sb.append(String.format(z9d.a, sb3.toString(), obj));
    }
}
