package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ezb extends AbstractMap {
    public static final xyb y = new xyb();
    public final Object[] t;
    public final int[] u;
    public final dzb v;
    public Integer w;
    public String x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ezb, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ezb] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public ezb(ezb ezbVar, ezb ezbVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.v = new dzb(abstractMap, -1);
        abstractMap.w = null;
        abstractMap.x = null;
        int size = ezbVar2.size() + ezbVar.size();
        int i = ezbVar.u[ezbVar.size()] + ezbVar2.u[ezbVar2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = ezbVar.c(0);
        Map.Entry entryC2 = ezbVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        int i6 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new dzb(abstractMap, i6));
                        dzb dzbVar = (dzb) entryC.getValue();
                        dzb dzbVar2 = (dzb) entryC2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iE = dzbVar.e();
                            ezb ezbVar3 = dzbVar.u;
                            if (i9 >= iE - dzbVar.d() && i10 >= dzbVar2.e() - dzbVar2.d()) {
                                break;
                            }
                            int iCompare = i9 == dzbVar.e() - dzbVar.d() ? 1 : i10 == dzbVar2.e() - dzbVar2.d() ? -1 : 0;
                            if (iCompare == 0) {
                                vyb vybVar = gzb.b;
                                iCompare = gzb.b.compare(ezbVar3.t[dzbVar.d() + i9], dzbVar2.u.t[dzbVar2.d() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = ezbVar3.t[dzbVar.d() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = dzbVar2.u.t[dzbVar2.d() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i6] = iA;
                        entryC = ezbVar.c(i8);
                        entryC2 = ezbVar2.c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC, i6, iA, objArr2, iArr);
                entryC = ezbVar.c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = ezbVar2.c(i4);
            iA = iA2;
            entryC = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.t = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.u = b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        dzb dzbVar = (dzb) entry.getValue();
        int iE = dzbVar.e() - dzbVar.d();
        System.arraycopy(dzbVar.u.t, dzbVar.d(), objArr, i2, iE);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new dzb(this, i));
        int i3 = i2 + iE;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.u[0]) {
            return (Map.Entry) this.t[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.w == null) {
            this.w = Integer.valueOf(super.hashCode());
        }
        return this.w.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.x == null) {
            this.x = super.toString();
        }
        return this.x;
    }

    public ezb() {
        List list = Collections.EMPTY_LIST;
        this.v = new dzb(this, -1);
        this.w = null;
        this.x = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.t = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.u = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
