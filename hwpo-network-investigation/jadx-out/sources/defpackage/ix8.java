package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.intercom.twig.BuildConfig;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ix8 {
    public gv1 a;
    public gv1 b;

    public final ue0 a(b bVar) throws c24 {
        String string;
        JSONArray jSONArray = bVar.g;
        long j = bVar.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, BuildConfig.FLAVOR);
                b bVarC = this.a.c();
                String string3 = null;
                if (bVarC == null) {
                    string = null;
                } else {
                    try {
                        string = bVarC.b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    b bVarC2 = this.b.c();
                    if (bVarC2 != null) {
                        try {
                            string3 = bVarC2.b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : BuildConfig.FLAVOR;
                }
                int i2 = fx8.a;
                se0.a aVar = new se0.a();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                aVar.a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                aVar.b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                aVar.c = strOptString;
                aVar.d = string;
                aVar.e = j;
                aVar.f = (byte) (aVar.f | 1);
                hashSet.add(aVar.a());
            } catch (JSONException e) {
                throw new c24("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new ue0(hashSet);
    }
}
