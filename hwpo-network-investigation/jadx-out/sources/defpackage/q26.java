package defpackage;

import android.net.Uri;
import androidx.fragment.app.f;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q26 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ q26(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment = (LeaderboardDetailsFiltersFlowFragment) obj;
                LeaderboardDetailsFiltersFlowFragment.Companion companion = LeaderboardDetailsFiltersFlowFragment.Companion;
                if (leaderboardDetailsFiltersFlowFragment.getChildFragmentManager().H() > 1) {
                    f fVarD = leaderboardDetailsFiltersFlowFragment.getChildFragmentManager().D(leaderboardDetailsFiltersFlowFragment.Q);
                    hk0 hk0Var = fVarD instanceof hk0 ? (hk0) fVarD : null;
                    if (hk0Var != null) {
                        hk0Var.j();
                    } else {
                        leaderboardDetailsFiltersFlowFragment.i();
                    }
                } else {
                    leaderboardDetailsFiltersFlowFragment.i();
                }
                return g2b.a;
            default:
                x57 x57Var = (x57) obj;
                String str = x57Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) x57Var.e.getValue()).booleanValue()) {
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    for (String str2 : uri.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str2);
                        if (queryParameters.size() > 1) {
                            ca0.a(op3.a("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                        String str3 = (String) th1.A(queryParameters);
                        if (str3 == null) {
                            x57Var.g = true;
                            str3 = str2;
                        }
                        ol8 ol8Var = x57.n;
                        ol8Var.getClass();
                        str3.getClass();
                        Matcher matcher = ol8Var.t.matcher(str3);
                        matcher.getClass();
                        int i2 = 0;
                        x57.a aVar = new x57.a();
                        for (aj6 aj6VarB = t2.b(matcher, 0, str3); aj6VarB != null; aj6VarB = aj6VarB.b()) {
                            xi6 xi6VarE = aj6VarB.c.e(1);
                            xi6VarE.getClass();
                            aVar.b.add(xi6VarE.a);
                            if (aj6VarB.a().t > i2) {
                                String strQuote = Pattern.quote(str3.substring(i2, aj6VarB.a().t));
                                strQuote.getClass();
                                sb.append(strQuote);
                            }
                            sb.append("([\\s\\S]+?)?");
                            i2 = aj6VarB.a().u + 1;
                        }
                        if (i2 < str3.length()) {
                            String strQuote2 = Pattern.quote(str3.substring(i2));
                            strQuote2.getClass();
                            sb.append(strQuote2);
                        }
                        sb.append("$");
                        aVar.a = x57.g(sb.toString());
                        linkedHashMap.put(str2, aVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
