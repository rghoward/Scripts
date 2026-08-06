package defpackage;

import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sb6<Data, ResourceType, Transcode> {
    public final w58<List<Throwable>> a;
    public final List<? extends hn2<Data, ResourceType, Transcode>> b;
    public final String c;

    public sb6(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<hn2<Data, ResourceType, Transcode>> list, w58<List<Throwable>> w58Var) {
        this.a = w58Var;
        if (list.isEmpty()) {
            z90.a("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final kt8 a(int i, int i2, gn2.a aVar, xk7 xk7Var, a aVar2) {
        w58<List<Throwable>> w58Var = this.a;
        List<Throwable> listB = w58Var.b();
        ov9.d(listB, "Argument must not be null");
        try {
            List<? extends hn2<Data, ResourceType, Transcode>> list = this.b;
            int size = list.size();
            kt8 kt8VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    kt8VarA = list.get(i3).a(i, i2, aVar, xk7Var, aVar2);
                } catch (rm4 e) {
                    listB.add(e);
                }
                if (kt8VarA != null) {
                    break;
                }
            }
            if (kt8VarA == null) {
                throw new rm4(this.c, new ArrayList(listB));
            }
            w58Var.a(listB);
            return kt8VarA;
        } catch (Throwable th) {
            w58Var.a(listB);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
