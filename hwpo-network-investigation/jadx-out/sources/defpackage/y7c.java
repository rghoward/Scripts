package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y7c extends g6c {
    public final ArrayList v;
    public final ArrayList w;
    public final cgc x;

    public y7c(String str, ArrayList arrayList, List list, cgc cgcVar) {
        super(str);
        this.v = new ArrayList();
        this.x = cgcVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.v.add(((a8c) obj).c());
            }
        }
        this.w = new ArrayList(list);
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        k8c k8cVar;
        cgc cgcVarC = this.x.c();
        q8c q8cVar = cgcVarC.b;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            k8cVar = a8c.l;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                cgcVarC.f((String) arrayList.get(i2), cgcVar.b.b(cgcVar, (a8c) list.get(i2)));
            } else {
                cgcVarC.f((String) arrayList.get(i2), k8cVar);
            }
            i2++;
        }
        ArrayList arrayList2 = this.w;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            a8c a8cVar = (a8c) obj;
            a8c a8cVarB = q8cVar.b(cgcVarC, a8cVar);
            if (a8cVarB instanceof c8c) {
                a8cVarB = q8cVar.b(cgcVarC, a8cVar);
            }
            if (a8cVarB instanceof d4c) {
                return ((d4c) a8cVarB).t;
            }
        }
        return k8cVar;
    }

    @Override // defpackage.g6c, defpackage.a8c
    public final a8c n() {
        return new y7c(this);
    }

    public y7c(y7c y7cVar) {
        super(y7cVar.t);
        ArrayList arrayList = new ArrayList(y7cVar.v.size());
        this.v = arrayList;
        arrayList.addAll(y7cVar.v);
        ArrayList arrayList2 = new ArrayList(y7cVar.w.size());
        this.w = arrayList2;
        arrayList2.addAll(y7cVar.w);
        this.x = y7cVar.x;
    }
}
