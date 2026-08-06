package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ld9 implements SerialDescriptor, i11 {
    public final String a;
    public final pd9 b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final SerialDescriptor[] k;
    public final o7a l;

    public ld9(String str, pd9 pd9Var, int i, List<? extends SerialDescriptor> list, td1 td1Var) {
        pd9Var.getClass();
        this.a = str;
        this.b = pd9Var;
        this.c = i;
        this.d = td1Var.b;
        ArrayList arrayList = td1Var.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(pi6.g(ph1.n(arrayList, 12)));
        th1.Q(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = g28.c(td1Var.e);
        this.h = (List[]) td1Var.f.toArray(new List[0]);
        this.i = th1.P(td1Var.g);
        strArr.getClass();
        ta5 ta5Var = new ta5(new s30(0, strArr));
        ArrayList arrayList2 = new ArrayList(ph1.n(ta5Var, 10));
        Iterator it = ta5Var.iterator();
        while (true) {
            ua5 ua5Var = (ua5) it;
            if (!ua5Var.t.hasNext()) {
                this.j = qi6.k(arrayList2);
                this.k = g28.c(list);
                this.l = new o7a(new kd9(i2, this));
                return;
            }
            sa5 sa5Var = (sa5) ua5Var.next();
            arrayList2.add(new js7(sa5Var.b, Integer.valueOf(sa5Var.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // defpackage.i11
    public final Set<String> b() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final pd9 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ld9) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals(this.k, ((ld9) obj).k)) {
                int iF = serialDescriptor.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        if (xj5.a(serialDescriptorArr[i2].a(), serialDescriptor.i(i2).a()) && xj5.a(serialDescriptorArr[i2].e(), serialDescriptor.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return zs4.d(this);
    }
}
