package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ml3 extends o48 {
    public final pd9.b l;
    public final o7a m;

    public ml3(final String str, final int i) {
        super(str, null, i);
        this.l = pd9.b.a;
        this.m = new o7a(new mh4() { // from class: ll3
            @Override // defpackage.mh4
            public final Object invoke() {
                int i2 = i;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = od9.c(str + '.' + this.e[i3], g3a.d.a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // defpackage.o48, kotlinx.serialization.descriptors.SerialDescriptor
    public final pd9 e() {
        return this.l;
    }

    @Override // defpackage.o48
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.e() == pd9.b.a && this.a.equals(serialDescriptor.a()) && xj5.a(g28.b(this), g28.b(serialDescriptor));
    }

    @Override // defpackage.o48
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        md9 md9Var = new md9(this);
        int iHashCode2 = 1;
        while (md9Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) md9Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.o48, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    @Override // defpackage.o48
    public final String toString() {
        return th1.F(new nd9(this), ", ", this.a.concat("("), ")", null, 56);
    }
}
