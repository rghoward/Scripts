package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import io.ably.lib.transport.Defaults;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ric {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ zic d;

    public ric(zic zicVar, String str) {
        this.d = zicVar;
        a78.d(str);
        this.a = str;
        this.b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f6 A[Catch: NumberFormatException | JSONException -> 0x0103, NumberFormatException | JSONException -> 0x0103, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0103, blocks: (B:10:0x0029, B:24:0x005d, B:24:0x005d, B:26:0x006a, B:26:0x006a, B:28:0x007c, B:28:0x007c, B:29:0x0085, B:29:0x0085, B:51:0x00f6, B:51:0x00f6, B:33:0x0092, B:33:0x0092, B:35:0x009f, B:35:0x009f, B:37:0x00b1, B:37:0x00b1, B:38:0x00ba, B:38:0x00ba, B:42:0x00c6, B:42:0x00c6, B:46:0x00d6, B:46:0x00d6, B:50:0x00ea, B:50:0x00ea), top: B:63:0x0029, outer: #1 }] */
    public final Bundle a() {
        if (this.c == null) {
            zic zicVar = this.d;
            SharedPreferences sharedPreferencesK = zicVar.k();
            tkc tkcVar = zicVar.a;
            String string = sharedPreferencesK.getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                o6c.a();
                                                if (tkcVar.d.r(null, wfc.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString(Defaults.ABLY_PROTOCOL_VERSION_PARAM));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                thc thcVar = tkcVar.f;
                                                tkc.m(thcVar);
                                                thcVar.f.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            o6c.a();
                                            if (tkcVar.d.r(null, wfc.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString(Defaults.ABLY_PROTOCOL_VERSION_PARAM));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            thc thcVar2 = tkcVar.f;
                                            tkc.m(thcVar2);
                                            thcVar2.f.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString(Defaults.ABLY_PROTOCOL_VERSION_PARAM));
                                    } else {
                                        thc thcVar3 = tkcVar.f;
                                        tkc.m(thcVar3);
                                        thcVar3.f.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString(Defaults.ABLY_PROTOCOL_VERSION_PARAM)));
                                } else {
                                    thc thcVar4 = tkcVar.f;
                                    tkc.m(thcVar4);
                                    thcVar4.f.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(Defaults.ABLY_PROTOCOL_VERSION_PARAM)));
                            } else {
                                thc thcVar5 = tkcVar.f;
                                tkc.m(thcVar5);
                                thcVar5.f.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            thc thcVar6 = tkcVar.f;
                            tkc.m(thcVar6);
                            thcVar6.f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    thc thcVar7 = tkcVar.f;
                    tkc.m(thcVar7);
                    thcVar7.f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        Bundle bundle2 = this.c;
        a78.g(bundle2);
        return new Bundle(bundle2);
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zic zicVar = this.d;
        SharedPreferences sharedPreferencesK = zicVar.k();
        tkc tkcVar = zicVar.a;
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        int size = bundle2.size();
        String str = this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        o6c.a();
                        if (tkcVar.d.r(null, wfc.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                thc thcVar = tkcVar.f;
                                tkc.m(thcVar);
                                thcVar.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put(Defaults.ABLY_PROTOCOL_VERSION_PARAM, obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                thc thcVar2 = tkcVar.f;
                                tkc.m(thcVar2);
                                thcVar2.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        thc thcVar3 = tkcVar.f;
                        tkc.m(thcVar3);
                        thcVar3.f.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }
}
