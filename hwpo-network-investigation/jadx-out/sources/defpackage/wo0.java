package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ wo0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                tl5 tl5Var = (tl5) obj;
                tl5Var.getClass();
                for (bb bbVar : (List) obj2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Integer numValueOf = Integer.valueOf(bbVar.a);
                    pc5 pc5Var = hm5.a;
                    tl5Var.a.add(new JsonObject(linkedHashMap));
                }
                return g2b.a;
            case 1:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                w96 w96Var = (w96) yaVar.u;
                w96Var.c.setImageResource(((un4) yaVar.t()).w);
                w96Var.b.setSelected(((un4) yaVar.t()).u);
                return g2b.a;
            default:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) ((mh4) obj2).invoke()).floatValue());
        }
    }
}
