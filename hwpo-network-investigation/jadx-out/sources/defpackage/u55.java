package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u55 {
    public static final u55 b;
    public final JSONObject a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final JSONObject a;

        public a() {
            JSONObject jSONObject = new JSONObject();
            this.a = jSONObject;
            a(0, "autoplay");
            a(0, "controls");
            a(1, "enablejsapi");
            a(0, "fs");
            try {
                jSONObject.put("origin", "https://com.hwpo_training_app");
                a(0, "rel");
                a(0, "showinfo");
                a(3, "iv_load_policy");
                a(0, "modestbranding");
                a(0, "cc_load_policy");
            } catch (JSONException unused) {
                ru3.d("Illegal JSON value origin: https://com.hwpo_training_app");
                throw null;
            }
        }

        public final void a(int i, String str) {
            try {
                this.a.put(str, i);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i);
            }
        }
    }

    static {
        a aVar = new a();
        aVar.a(1, "controls");
        b = new u55(aVar.a);
    }

    public u55(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
