package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r2d extends g6c {
    public final boolean v;
    public final boolean w;
    public final /* synthetic */ p3d x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2d(p3d p3dVar, boolean z, boolean z2) {
        super("log");
        this.x = p3dVar;
        this.v = z;
        this.w = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[LOOP:0: B:23:0x008b->B:25:0x0095, LOOP_END] */
    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        int i;
        int i2;
        String strC;
        ArrayList arrayList;
        gic.b(1, "log", list);
        int size = list.size();
        k8c k8cVar = a8c.l;
        p3d p3dVar = this.x;
        if (size == 1) {
            p3dVar.v.a(3, cgcVar.b.b(cgcVar, (a8c) list.get(0)).c(), Collections.EMPTY_LIST, this.v, this.w);
            return k8cVar;
        }
        a8c a8cVar = (a8c) list.get(0);
        q8c q8cVar = cgcVar.b;
        q8c q8cVar2 = cgcVar.b;
        int iG = gic.g(q8cVar.b(cgcVar, a8cVar).d().doubleValue());
        if (iG != 2) {
            i = 3;
            if (iG == 3) {
                i2 = 1;
            } else if (iG == 5) {
                i2 = 5;
            } else if (iG == 6) {
                i2 = 2;
            }
            strC = q8cVar2.b(cgcVar, (a8c) list.get(1)).c();
            if (list.size() == 2) {
                p3dVar.v.a(i2, strC, Collections.EMPTY_LIST, this.v, this.w);
                return k8cVar;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(q8cVar2.b(cgcVar, (a8c) list.get(i3)).c());
            }
            p3dVar.v.a(i2, strC, arrayList, this.v, this.w);
            return k8cVar;
        }
        i = 4;
        i2 = i;
        strC = q8cVar2.b(cgcVar, (a8c) list.get(1)).c();
        if (list.size() == 2) {
            p3dVar.v.a(i2, strC, Collections.EMPTY_LIST, this.v, this.w);
            return k8cVar;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(q8cVar2.b(cgcVar, (a8c) list.get(i3)).c());
        }
        p3dVar.v.a(i2, strC, arrayList, this.v, this.w);
        return k8cVar;
    }
}
