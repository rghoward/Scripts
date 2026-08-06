package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jc5 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(sd1 sd1Var, oh4 oh4Var) {
        oh4Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(sd1Var)) {
            e55.c("A `initializer` with the same `clazz` has already been added: ", sd1Var.e(), 46);
        } else {
            linkedHashMap.put(sd1Var, new phb(sd1Var, oh4Var));
        }
    }

    public final ic5 b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        phb[] phbVarArr = (phb[]) collectionValues.toArray(new phb[0]);
        return new ic5((phb[]) Arrays.copyOf(phbVarArr, phbVarArr.length));
    }
}
