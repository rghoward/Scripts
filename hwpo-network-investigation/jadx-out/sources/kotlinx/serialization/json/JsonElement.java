package kotlinx.serialization.json;

import defpackage.nm5;
import defpackage.rd9;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9(with = nm5.class)
public abstract class JsonElement {
    public static final Companion Companion = new Companion();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<JsonElement> serializer() {
            return nm5.a;
        }
    }
}
