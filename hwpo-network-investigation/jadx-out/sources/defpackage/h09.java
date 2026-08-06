package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h09 implements ci4 {
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0015->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[EDGE_INSN: B:24:0x005f->B:19:0x005f BREAK  A[LOOP:0: B:5:0x0015->B:18:0x005c], SYNTHETIC] */
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        l09 l09Var = (l09) obj2;
        Map<Object, Map<String, List<Object>>> map = l09Var.t;
        c37<Object, m09> c37Var = l09Var.u;
        Object[] objArr = c37Var.b;
        Object[] objArr2 = c37Var.c;
        long[] jArr = c37Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj3 = objArr[i4];
                            Map<String, List<Object>> mapC = ((m09) objArr2[i4]).c();
                            if (mapC.isEmpty()) {
                                map.remove(obj3);
                            } else {
                                map.put(obj3, mapC);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }
}
