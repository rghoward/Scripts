package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a78;
import defpackage.ms3;
import defpackage.mub;
import defpackage.p2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new mub();
    public final String A;
    public final List B;
    public final String C;
    public final String D;
    public final HashSet E = new HashSet();
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final Uri x;
    public String y;
    public final long z;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = uri;
        this.y = str5;
        this.z = j;
        this.A = str6;
        this.B = arrayList;
        this.C = str7;
        this.D = str8;
    }

    public static GoogleSignInAccount k(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        a78.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.A.equals(this.A) && googleSignInAccount.j().equals(j());
    }

    public final int hashCode() {
        return ((this.A.hashCode() + 527) * 31) + j().hashCode();
    }

    public final HashSet j() {
        HashSet hashSet = new HashSet(this.B);
        hashSet.addAll(this.E);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.i(parcel, 3, this.u);
        ms3.i(parcel, 4, this.v);
        ms3.i(parcel, 5, this.w);
        ms3.h(parcel, 6, this.x, i);
        ms3.i(parcel, 7, this.y);
        ms3.l(parcel, 8, 8);
        parcel.writeLong(this.z);
        ms3.i(parcel, 9, this.A);
        ms3.k(parcel, 10, this.B);
        ms3.i(parcel, 11, this.C);
        ms3.i(parcel, 12, this.D);
        ms3.n(parcel, iM);
    }
}
