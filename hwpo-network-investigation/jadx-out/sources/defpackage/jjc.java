package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jjc {
    public final /* synthetic */ ujc a;

    public jjc(ujc ujcVar) {
        this.a = ujcVar;
    }

    public final void a(int i, String str, List list, boolean z, boolean z2) {
        phc phcVar;
        int i2 = i - 1;
        ujc ujcVar = this.a;
        if (i2 == 0) {
            thc thcVar = ujcVar.a.f;
            tkc.m(thcVar);
            phcVar = thcVar.m;
        } else if (i2 != 1) {
            if (i2 == 3) {
                thc thcVar2 = ujcVar.a.f;
                tkc.m(thcVar2);
                phcVar = thcVar2.n;
            } else if (i2 != 4) {
                thc thcVar3 = ujcVar.a.f;
                tkc.m(thcVar3);
                phcVar = thcVar3.l;
            } else if (z) {
                thc thcVar4 = ujcVar.a.f;
                tkc.m(thcVar4);
                phcVar = thcVar4.j;
            } else if (z2) {
                thc thcVar5 = ujcVar.a.f;
                tkc.m(thcVar5);
                phcVar = thcVar5.i;
            } else {
                thc thcVar6 = ujcVar.a.f;
                tkc.m(thcVar6);
                phcVar = thcVar6.k;
            }
        } else if (z) {
            thc thcVar7 = ujcVar.a.f;
            tkc.m(thcVar7);
            phcVar = thcVar7.g;
        } else if (z2) {
            thc thcVar8 = ujcVar.a.f;
            tkc.m(thcVar8);
            phcVar = thcVar8.f;
        } else {
            thc thcVar9 = ujcVar.a.f;
            tkc.m(thcVar9);
            phcVar = thcVar9.h;
        }
        int size = list.size();
        if (size == 1) {
            phcVar.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            phcVar.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            phcVar.a(str);
        } else {
            phcVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
