package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface jnb {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final knb b;
        public static final knb c;
        public static final knb d;
        public static final knb e;
        public static final knb f;
        public static final knb g;
        public static final knb h;
        public static final knb i;
        public static final knb j;

        static {
            knb knbVar = new knb("caption bar");
            b = knbVar;
            knb knbVar2 = new knb("display cutout");
            c = knbVar2;
            knb knbVar3 = new knb("ime");
            d = knbVar3;
            knb knbVar4 = new knb("mandatory system gestures");
            e = knbVar4;
            knb knbVar5 = new knb("navigation bars");
            f = knbVar5;
            knb knbVar6 = new knb("status bars");
            g = knbVar6;
            char c2 = 2;
            jnb[] jnbVarArr = {knbVar6, knbVar5, knbVar};
            ArrayList arrayList = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(jnbVarArr[i2].a());
            }
            yk8[] yk8VarArr = (yk8[]) arrayList.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length));
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList2.add(jnbVarArr[i3].b());
            }
            yk8[] yk8VarArr2 = (yk8[]) arrayList2.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr2, yk8VarArr2.length));
            knb knbVar7 = new knb("system gestures");
            h = knbVar7;
            knb knbVar8 = new knb("tappable element");
            i = knbVar8;
            knb knbVar9 = new knb("waterfall");
            j = knbVar9;
            jnb[] jnbVarArr2 = {knbVar6, knbVar5, knbVar, knbVar2, knbVar3, knbVar8};
            ArrayList arrayList3 = new ArrayList(6);
            int i4 = 0;
            while (i4 < 6) {
                arrayList3.add(jnbVarArr2[i4].a());
                i4++;
                c2 = c2;
            }
            char c3 = c2;
            yk8[] yk8VarArr3 = (yk8[]) arrayList3.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr3, yk8VarArr3.length));
            ArrayList arrayList4 = new ArrayList(6);
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList4.add(jnbVarArr2[i5].b());
            }
            yk8[] yk8VarArr4 = (yk8[]) arrayList4.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr4, yk8VarArr4.length));
            jnb[] jnbVarArr3 = new jnb[4];
            jnbVarArr3[0] = knbVar4;
            jnbVarArr3[1] = knbVar7;
            jnbVarArr3[c3] = knbVar8;
            jnbVarArr3[3] = knbVar9;
            ArrayList arrayList5 = new ArrayList(4);
            for (int i6 = 0; i6 < 4; i6++) {
                arrayList5.add(jnbVarArr3[i6].a());
            }
            yk8[] yk8VarArr5 = (yk8[]) arrayList5.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr5, yk8VarArr5.length));
            ArrayList arrayList6 = new ArrayList(4);
            for (int i7 = 0; i7 < 4; i7++) {
                arrayList6.add(jnbVarArr3[i7].b());
            }
            yk8[] yk8VarArr6 = (yk8[]) arrayList6.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr6, yk8VarArr6.length));
            jnb[] jnbVarArr4 = new jnb[9];
            jnbVarArr4[0] = knbVar6;
            jnbVarArr4[1] = knbVar5;
            jnbVarArr4[c3] = knbVar;
            jnbVarArr4[3] = knbVar3;
            jnbVarArr4[4] = knbVar7;
            jnbVarArr4[5] = knbVar4;
            jnbVarArr4[6] = knbVar8;
            jnbVarArr4[7] = knbVar2;
            jnbVarArr4[8] = knbVar9;
            ArrayList arrayList7 = new ArrayList(9);
            for (int i8 = 0; i8 < 9; i8++) {
                arrayList7.add(jnbVarArr4[i8].a());
            }
            yk8[] yk8VarArr7 = (yk8[]) arrayList7.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr7, yk8VarArr7.length));
            ArrayList arrayList8 = new ArrayList(9);
            for (int i9 = 0; i9 < 9; i9++) {
                arrayList8.add(jnbVarArr4[i9].b());
            }
            yk8[] yk8VarArr8 = (yk8[]) arrayList8.toArray(new yk8[0]);
            new gd5((yk8[]) Arrays.copyOf(yk8VarArr8, yk8VarArr8.length));
        }
    }

    yk8 a();

    yk8 b();
}
