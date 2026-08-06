package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bn5 implements KSerializer<JsonObject> {
    public static final bn5 a = new bn5();
    public static final a b = a.b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ s86 a;

        public a() {
            o2a o2aVar = o2a.a;
            nm5 nm5Var = nm5.a;
            SerialDescriptor descriptor = o2aVar.getDescriptor();
            SerialDescriptor descriptor2 = nm5Var.getDescriptor();
            descriptor.getClass();
            descriptor2.getClass();
            this.a = new s86(descriptor, descriptor2);
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
            return g3a.c.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int f() {
            this.a.getClass();
            return 2;
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
        return new JsonObject(new t86(o2a.a, nm5.a).deserialize(decoder));
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        jsonObject.getClass();
        hu1.e(encoder);
        new t86(o2a.a, nm5.a).serialize(encoder, jsonObject);
    }
}
