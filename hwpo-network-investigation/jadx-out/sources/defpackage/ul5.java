package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ul5 implements KSerializer<JsonArray> {
    public static final ul5 a = new ul5();
    public static final a b = a.b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ l30 a;

        public a() {
            SerialDescriptor descriptor = nm5.a.getDescriptor();
            descriptor.getClass();
            this.a = new l30(descriptor);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String a() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean c() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int d(String str) {
            str.getClass();
            return this.a.d(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final pd9 e() {
            this.a.getClass();
            return g3a.b.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int f() {
            this.a.getClass();
            return 1;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String g(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> getAnnotations() {
            this.a.getClass();
            return hf3.t;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> h(int i) {
            this.a.h(i);
            return hf3.t;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final SerialDescriptor i(int i) {
            return this.a.i(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isInline() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean j(int i) {
            this.a.j(i);
            return false;
        }
    }

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        hu1.f(decoder);
        return new JsonArray((List) new m30(nm5.a).e(decoder));
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        hu1.e(encoder);
        nm5 nm5Var = nm5.a;
        SerialDescriptor descriptor = nm5Var.getDescriptor();
        descriptor.getClass();
        l30 l30Var = new l30(descriptor);
        int size = jsonArray.size();
        st1 st1VarW = encoder.w(l30Var);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            st1VarW.q(l30Var, i, nm5Var, it.next());
        }
        st1VarW.i(l30Var);
    }
}
