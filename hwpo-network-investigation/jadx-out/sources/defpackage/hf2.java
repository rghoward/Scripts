package defpackage;

import com.intercom.twig.BuildConfig;
import defpackage.qj3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hf2<T extends qj3> extends bk0<T> {
    public ArrayList o;
    public float p;
    public float q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("UP", 0);
            t = aVar;
            a aVar2 = new a("DOWN", 1);
            u = aVar2;
            a aVar3 = new a("CLOSEST", 2);
            v = aVar3;
            w = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    @Override // defpackage.t55
    public final float A() {
        return this.r;
    }

    @Override // defpackage.t55
    public final int H() {
        return this.o.size();
    }

    public final int N(float f, float f2, a aVar) {
        int i;
        qj3 qj3Var;
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float fB = ((qj3) arrayList.get(i3)).b() - f;
            int i4 = i3 + 1;
            float fB2 = ((qj3) arrayList.get(i4)).b() - f;
            float fAbs = Math.abs(fB);
            float fAbs2 = Math.abs(fB2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = fB;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size != -1) {
            float fB3 = ((qj3) arrayList.get(size)).b();
            if (aVar == a.t) {
                if (fB3 < f && size < arrayList.size() - 1) {
                    size++;
                }
            } else if (aVar == a.u && fB3 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((qj3) arrayList.get(size - 1)).b() == fB3) {
                    size--;
                }
                float fA = ((qj3) arrayList.get(size)).a();
                loop2: while (true) {
                    i = size;
                    do {
                        size++;
                        if (size >= arrayList.size()) {
                            break loop2;
                        }
                        qj3Var = (qj3) arrayList.get(size);
                        if (qj3Var.b() != fB3) {
                            break loop2;
                        }
                    } while (Math.abs(qj3Var.a() - f2) >= Math.abs(fA - f2));
                    fA = f2;
                }
                return i;
            }
        }
        return size;
    }

    @Override // defpackage.t55
    public final float b() {
        return this.s;
    }

    @Override // defpackage.t55
    public final float c() {
        return this.p;
    }

    @Override // defpackage.t55
    public final qj3 e(float f, float f2) {
        int iN = N(f, f2, a.v);
        if (iN > -1) {
            return (qj3) this.o.get(iN);
        }
        return null;
    }

    @Override // defpackage.t55
    public final float i() {
        return this.q;
    }

    @Override // defpackage.t55
    public final int j(qj3 qj3Var) {
        return this.o.indexOf(qj3Var);
    }

    @Override // defpackage.t55
    public final T o(int i) {
        return (T) this.o.get(i);
    }

    public final String toString() {
        ArrayList arrayList = this.o;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(arrayList.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuffer.append(((qj3) arrayList.get(i)).toString().concat(" "));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.t55
    public final void x(float f, float f2) {
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        int iN = N(f2, Float.NaN, a.t);
        for (int iN2 = N(f, Float.NaN, a.u); iN2 <= iN; iN2++) {
            qj3 qj3Var = (qj3) arrayList.get(iN2);
            if (qj3Var.a() < this.q) {
                this.q = qj3Var.a();
            }
            if (qj3Var.a() > this.p) {
                this.p = qj3Var.a();
            }
        }
    }

    @Override // defpackage.t55
    public final ArrayList y(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            qj3 qj3Var = (qj3) arrayList2.get(i2);
            if (f == qj3Var.b()) {
                while (i2 > 0 && ((qj3) arrayList2.get(i2 - 1)).b() == f) {
                    i2--;
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    qj3 qj3Var2 = (qj3) arrayList2.get(i2);
                    if (qj3Var2.b() != f) {
                        break;
                    }
                    arrayList.add(qj3Var2);
                    i2++;
                }
                break;
            }
            if (f > qj3Var.b()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }
}
