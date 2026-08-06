package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g28 {
    public static final SerialDescriptor[] a = new SerialDescriptor[0];

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
    public static final Object a(List list, hc5 hc5Var, u02 u02Var) throws Throwable {
        bf2 bf2Var;
        List list2;
        gl8 gl8Var;
        Iterator it;
        Throwable th;
        oh4 oh4Var;
        if (u02Var instanceof bf2) {
            bf2Var = (bf2) u02Var;
            int i = bf2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf2Var.w = i - Integer.MIN_VALUE;
            } else {
                bf2Var = new bf2(u02Var);
            }
        } else {
            bf2Var = new bf2(u02Var);
        }
        Object obj = bf2Var.v;
        int i2 = bf2Var.w;
        Object obj2 = v72.t;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) bf2Var.t;
                dv8.b(obj);
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = bf2Var.u;
                gl8Var = (gl8) bf2Var.t;
                try {
                    dv8.b(obj);
                } catch (Throwable th2) {
                    T t = gl8Var.t;
                    if (t == 0) {
                        gl8Var.t = th2;
                    } else {
                        fn3.b((Throwable) t, th2);
                    }
                }
            }
            while (it.hasNext()) {
                oh4Var = (oh4) it.next();
                bf2Var.t = gl8Var;
                bf2Var.u = it;
                bf2Var.w = 2;
                if (oh4Var.invoke(bf2Var) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) gl8Var.t;
            if (th == null) {
                return g2b.a;
            }
            throw th;
        }
        dv8.b(obj);
        ArrayList arrayList = new ArrayList();
        cf2 cf2Var = new cf2(list, arrayList, null);
        bf2Var.t = arrayList;
        bf2Var.w = 1;
        if (hc5Var.a(cf2Var, bf2Var) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        gl8Var = new gl8();
        it = list2.iterator();
        while (it.hasNext()) {
            oh4Var = (oh4) it.next();
            bf2Var.t = gl8Var;
            bf2Var.u = it;
            bf2Var.w = 2;
            if (oh4Var.invoke(bf2Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) gl8Var.t;
        if (th == null) {
            return g2b.a;
        }
        throw th;
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof i11) {
            return ((i11) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int iF = serialDescriptor.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(serialDescriptor.g(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a : serialDescriptorArr;
    }

    public static String d(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        return i == 28 ? "Luminosity" : "Unknown";
    }
}
