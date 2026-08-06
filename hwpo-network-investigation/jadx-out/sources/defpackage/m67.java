package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m67 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ m67(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        int i2 = 1;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                T t = ((gl8) obj2).t;
                return Boolean.valueOf(t == 0 || !((Bundle) t).containsKey(str));
            case 1:
                ArrayList arrayList = (ArrayList) obj2;
                jz7.a aVar = (jz7.a) obj;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ll6 ll6Var = (ll6) arrayList.get(i3);
                    List<jz7> list = ll6Var.b;
                    boolean z = ll6Var.h;
                    if (ll6Var.l == Integer.MIN_VALUE) {
                        xc5.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        jz7 jz7Var = list.get(i4);
                        int[] iArr = ll6Var.j;
                        int i5 = i4 * 2;
                        long jD = bg5.d((((long) iArr[i5 + i2]) & 4294967295L) | (((long) iArr[i5]) << 32), ll6Var.c);
                        if (z) {
                            jz7.a.A(aVar, jz7Var, jD);
                        } else {
                            jz7.a.x(aVar, jz7Var, jD);
                        }
                        i4++;
                        i2 = 1;
                    }
                    i3++;
                    i2 = 1;
                }
                return g2b.a;
            default:
                l89 l89Var = (l89) obj;
                bf9.a aVar2 = bf9.Companion;
                l89Var.getClass();
                ((bf9) obj2).q().k(l89Var, true);
                return g2b.a;
        }
    }
}
