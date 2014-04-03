<style type="text/css">
/*!
 * Stylesheet for the Date Range Picker, for use with Bootstrap 2.x
 *
 * Copyright 2013 Dan Grossman ( http://www.dangrossman.info )
 * Licensed under the Apache License v2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Built for http://www.improvely.com
 */

.daterangepicker.dropdown-menu {
    max-width: none;
}

.daterangepicker.opensleft .ranges, .daterangepicker.opensleft .calendar {
    float: left;
    margin: 4px;
}

.daterangepicker.opensright .ranges, .daterangepicker.opensright .calendar {
    float: right;
    margin: 4px;
}

.daterangepicker .ranges {
    width: 160px;
    text-align: left;
}

.daterangepicker .ranges .range_inputs > div {
    float: left;
}

.daterangepicker .ranges .range_inputs > div:nth-child(2) {
    padding-left: 11px;
}

.daterangepicker .calendar {
    display: none;
    max-width: 250px;
}

.daterangepicker .calendar th, .daterangepicker .calendar td {
    font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    white-space: nowrap;
    text-align: center;
}

.daterangepicker .ranges label {
    color: #333;
    font-size: 11px;
    margin-bottom: 2px;
    text-transform: uppercase;
    text-shadow: 1px 1px 0 #fff;
}

.daterangepicker .ranges input {
    font-size: 11px;
}

.daterangepicker .ranges ul {
    list-style: none;
    margin: 0;
    padding: 0;
}

.daterangepicker .ranges li {
    font-size: 13px;
    background: #f5f5f5;
    border: 1px solid #f5f5f5;
    color: #08c;
    padding: 3px 12px;
    margin-bottom: 8px;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    cursor: pointer;
}

.daterangepicker .ranges li.active, .daterangepicker .ranges li:hover {
    background: #08c;
    border: 1px solid #08c;
    color: #fff;
}

.daterangepicker .calendar-date {
    border: 1px solid #ddd;
    padding: 4px;
    border-radius: 4px;
    background: #fff;
}

.daterangepicker .calendar-time {
    text-align: center;
    margin: 8px auto 0 auto;
    line-height: 30px;
}

.daterangepicker {
    position: absolute;
    background: #fff;
    top: 100px;
    left: 20px;
    padding: 4px;
    margin-top: 1px;
    -webkit-border-radius: 4px;
    -moz-border-radius: 4px;
    border-radius: 4px;
}

.daterangepicker.opensleft:before {
    position: absolute;
    top: -7px;
    right: 9px;
    display: inline-block;
    border-right: 7px solid transparent;
    border-bottom: 7px solid #ccc;
    border-left: 7px solid transparent;
    border-bottom-color: rgba(0, 0, 0, 0.2);
    content: '';
}

.daterangepicker.opensleft:after {
    position: absolute;
    top: -6px;
    right: 10px;
    display: inline-block;
    border-right: 6px solid transparent;
    border-bottom: 6px solid #fff;
    border-left: 6px solid transparent;
    content: '';
}

.daterangepicker.opensright:before {
    position: absolute;
    top: -7px;
    left: 9px;
    display: inline-block;
    border-right: 7px solid transparent;
    border-bottom: 7px solid #ccc;
    border-left: 7px solid transparent;
    border-bottom-color: rgba(0, 0, 0, 0.2);
    content: '';
}

.daterangepicker.opensright:after {
    position: absolute;
    top: -6px;
    left: 10px;
    display: inline-block;
    border-right: 6px solid transparent;
    border-bottom: 6px solid #fff;
    border-left: 6px solid transparent;
    content: '';
}

.daterangepicker table {
    width: 100%;
    margin: 0;
}

.daterangepicker td, .daterangepicker th {
    text-align: center;
    width: 20px;
    height: 20px;
    -webkit-border-radius: 4px;
    -moz-border-radius: 4px;
    border-radius: 4px;
    cursor: pointer;
    white-space: nowrap;
}

.daterangepicker td.off {
    color: #999;
}

.daterangepicker td.disabled {
    color: #999;
}

.daterangepicker td.available:hover, .daterangepicker th.available:hover {
    background: #eee;
}

.daterangepicker td.in-range {
    background: #ebf4f8;
    -webkit-border-radius: 0;
    -moz-border-radius: 0;
    border-radius: 0;
}

.daterangepicker td.active, .daterangepicker td.active:hover {
    background-color: #006dcc;
    background-image: -moz-linear-gradient(top, #0088cc, #0044cc);
    background-image: -ms-linear-gradient(top, #0088cc, #0044cc);
    background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#0088cc), to(#0044cc));
    background-image: -webkit-linear-gradient(top, #0088cc, #0044cc);
    background-image: -o-linear-gradient(top, #0088cc, #0044cc);
    background-image: linear-gradient(top, #0088cc, #0044cc);
    background-repeat: repeat-x;
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0088cc', endColorstr='#0044cc', GradientType=0);
    border-color: #0044cc #0044cc #002a80;
    border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);
    color: #fff;
    text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
}

.daterangepicker td.week, .daterangepicker th.week {
    font-size: 80%;
    color: #ccc;
}

.daterangepicker select.monthselect, .daterangepicker select.yearselect {
    font-size: 12px;
    padding: 1px;
    height: auto;
    margin: 0;
    cursor: default;
}

.daterangepicker select.monthselect {
    margin-right: 2%;
    width: 56%;
}

.daterangepicker select.yearselect {
    width: 40%;
}

.daterangepicker select.hourselect, .daterangepicker select.minuteselect, .daterangepicker select.ampmselect {
    width: 60px;
    margin-bottom: 0;
}
</style>

<r:script disposition='head'>

    (function (e) {
        function O(e, t) {
            return function (n) {
                return j(e.call(this, n), t)
            }
        }

        function M(e) {
            return function (t) {
                return this.lang().ordinal(e.call(this, t))
            }
        }

        function _() {
        }

        function D(e) {
            H(this, e)
        }

        function P(e) {
            var t = this._data = {}, n = e.years || e.year || e.y || 0, r = e.months || e.month || e.M || 0, i = e.weeks || e.week || e.w || 0, s = e.days || e.day || e.d || 0, o = e.hours || e.hour || e.h || 0, u = e.minutes || e.minute || e.m || 0, a = e.seconds || e.second || e.s || 0, f = e.milliseconds || e.millisecond || e.ms || 0;
            this._milliseconds = f + a * 1e3 + u * 6e4 + o * 36e5, this._days = s + i * 7, this._months = r + n * 12, t.milliseconds = f % 1e3, a += B(f / 1e3), t.seconds = a % 60, u += B(a / 60), t.minutes = u % 60, o += B(u / 60), t.hours = o % 24, s += B(o / 24), s += i * 7, t.days = s % 30, r += B(s / 30), t.months = r % 12, n += B(r / 12), t.years = n
        }

        function H(e, t) {
            for (var n in t)t.hasOwnProperty(n) && (e[n] = t[n]);
            return e
        }

        function B(e) {
            return e < 0 ? Math.ceil(e) : Math.floor(e)
        }

        function j(e, t) {
            var n = e + "";
            while (n.length < t)n = "0" + n;
            return n
        }

        function F(e, t, n) {
            var r = t._milliseconds, i = t._days, s = t._months, o;
            r && e._d.setTime(+e + r * n), i && e.date(e.date() + i * n), s && (o = e.date(), e.date(1).month(e.month() + s * n).date(Math.min(o, e.daysInMonth())))
        }

        function I(e) {
            return Object.prototype.toString.call(e) === "[object Array]"
        }

        function q(e, t) {
            var n = Math.min(e.length, t.length), r = Math.abs(e.length - t.length), i = 0, s;
            for (s = 0; s < n; s++)~~e[s] !== ~~t[s] && i++;
            return i + r
        }

        function R(e, t) {
            return t.abbr = e, s[e] || (s[e] = new _), s[e].set(t), s[e]
        }

        function U(e) {
            return e ? (!s[e] && o && require("./lang/" + e), s[e]) : t.fn._lang
        }

        function z(e) {
            return e.match(/\[.*\]/) ? e.replace(/^\[|\]$/g, "") : e.replace(/\\/g, "")
        }

        function W(e) {
            var t = e.match(a), n, r;
            for (n = 0, r = t.length; n < r; n++)A[t[n]] ? t[n] = A[t[n]] : t[n] = z(t[n]);
            return function (i) {
                var s = "";
                for (n = 0; n < r; n++)s += typeof t[n].call == "function" ? t[n].call(i, e) : t[n];
                return s
            }
        }

        function X(e, t) {
            function r(t) {
                return e.lang().longDateFormat(t) || t
            }

            var n = 5;
            while (n-- && f.test(t))t = t.replace(f, r);
            return C[t] || (C[t] = W(t)), C[t](e)
        }

        function V(e) {
            switch (e) {
                case"DDDD":
                    return p;
                case"YYYY":
                    return d;
                case"YYYYY":
                    return v;
                case"S":
                case"SS":
                case"SSS":
                case"DDD":
                    return h;
                case"MMM":
                case"MMMM":
                case"dd":
                case"ddd":
                case"dddd":
                case"a":
                case"A":
                    return m;
                case"X":
                    return b;
                case"Z":
                case"ZZ":
                    return g;
                case"T":
                    return y;
                case"MM":
                case"DD":
                case"YY":
                case"HH":
                case"hh":
                case"mm":
                case"ss":
                case"M":
                case"D":
                case"d":
                case"H":
                case"h":
                case"m":
                case"s":
                    return c;
                default:
                    return new RegExp(e.replace("\\", ""))
            }
        }

        function $(e, t, n) {
            var r, i, s = n._a;
            switch (e) {
                case"M":
                case"MM":
                    s[1] = t == null ? 0 : ~~t - 1;
                    break;
                case"MMM":
                case"MMMM":
                    r = U(n._l).monthsParse(t), r != null ? s[1] = r : n._isValid = !1;
                    break;
                case"D":
                case"DD":
                case"DDD":
                case"DDDD":
                    t != null && (s[2] = ~~t);
                    break;
                case"YY":
                    s[0] = ~~t + (~~t > 68 ? 1900 : 2e3);
                    break;
                case"YYYY":
                case"YYYYY":
                    s[0] = ~~t;
                    break;
                case"a":
                case"A":
                    n._isPm = (t + "").toLowerCase() === "pm";
                    break;
                case"H":
                case"HH":
                case"h":
                case"hh":
                    s[3] = ~~t;
                    break;
                case"m":
                case"mm":
                    s[4] = ~~t;
                    break;
                case"s":
                case"ss":
                    s[5] = ~~t;
                    break;
                case"S":
                case"SS":
                case"SSS":
                    s[6] = ~~(("0." + t) * 1e3);
                    break;
                case"X":
                    n._d = new Date(parseFloat(t) * 1e3);
                    break;
                case"Z":
                case"ZZ":
                    n._useUTC = !0, r = (t + "").match(x), r && r[1] && (n._tzh = ~~r[1]), r && r[2] && (n._tzm = ~~r[2]), r && r[0] === "+" && (n._tzh = -n._tzh, n._tzm = -n._tzm)
            }
            t == null && (n._isValid = !1)
        }

        function J(e) {
            var t, n, r = [];
            if (e._d)return;
            for (t = 0; t < 7; t++)e._a[t] = r[t] = e._a[t] == null ? t === 2 ? 1 : 0 : e._a[t];
            r[3] += e._tzh || 0, r[4] += e._tzm || 0, n = new Date(0), e._useUTC ? (n.setUTCFullYear(r[0], r[1], r[2]), n.setUTCHours(r[3], r[4], r[5], r[6])) : (n.setFullYear(r[0], r[1], r[2]), n.setHours(r[3], r[4], r[5], r[6])), e._d = n
        }

        function K(e) {
            var t = e._f.match(a), n = e._i, r, i;
            e._a = [];
            for (r = 0; r < t.length; r++)i = (V(t[r]).exec(n) || [])[0], i && (n = n.slice(n.indexOf(i) + i.length)), A[t[r]] && $(t[r], i, e);
            e._isPm && e._a[3] < 12 && (e._a[3] += 12), e._isPm === !1 && e._a[3] === 12 && (e._a[3] = 0), J(e)
        }

        function Q(e) {
            var t, n, r, i = 99, s, o, u;
            while (e._f.length) {
                t = H({}, e), t._f = e._f.pop(), K(t), n = new D(t);
                if (n.isValid()) {
                    r = n;
                    break
                }
                u = q(t._a, n.toArray()), u < i && (i = u, r = n)
            }
            H(e, r)
        }

        function G(e) {
            var t, n = e._i;
            if (w.exec(n)) {
                e._f = "YYYY-MM-DDT";
                for (t = 0; t < 4; t++)if (S[t][1].exec(n)) {
                    e._f += S[t][0];
                    break
                }
                g.exec(n) && (e._f += " Z"), K(e)
            } else e._d = new Date(n)
        }

        function Y(t) {
            var n = t._i, r = u.exec(n);
            n === e ? t._d = new Date : r ? t._d = new Date(+r[1]) : typeof n == "string" ? G(t) : I(n) ? (t._a = n.slice(0), J(t)) : t._d = n instanceof Date ? new Date(+n) : new Date(n)
        }

        function Z(e, t, n, r, i) {
            return i.relativeTime(t || 1, !!n, e, r)
        }

        function et(e, t, n) {
            var i = r(Math.abs(e) / 1e3), s = r(i / 60), o = r(s / 60), u = r(o / 24), a = r(u / 365), f = i < 45 && ["s", i] || s === 1 && ["m"] || s < 45 && ["mm", s] || o === 1 && ["h"] || o < 22 && ["hh", o] || u === 1 && ["d"] || u <= 25 && ["dd", u] || u <= 45 && ["M"] || u < 345 && ["MM", r(u / 30)] || a === 1 && ["y"] || ["yy", a];
            return f[2] = t, f[3] = e > 0, f[4] = n, Z.apply({}, f)
        }

        function tt(e, n, r) {
            var i = r - n, s = r - e.day();
            return s > i && (s -= 7), s < i - 7 && (s += 7), Math.ceil(t(e).add("d", s).dayOfYear() / 7)
        }

        function nt(e) {
            var n = e._i, r = e._f;
            return n === null || n === "" ? null : (typeof n == "string" && (e._i = n = U().preparse(n)), t.isMoment(n) ? (e = H({}, n), e._d = new Date(+n._d)) : r ? I(r) ? Q(e) : K(e) : Y(e), new D(e))
        }

        function rt(e, n) {
            t.fn[e] = t.fn[e + "s"] = function (e) {
                var t = this._isUTC ? "UTC" : "";
                return e != null ? (this._d["set" + t + n](e), this) : this._d["get" + t + n]()
            }
        }

        function it(e) {
            t.duration.fn[e] = function () {
                return this._data[e]
            }
        }

        function st(e, n) {
            t.duration.fn["as" + e] = function () {
                return+this / n
            }
        }

        var t, n = "2.0.0", r = Math.round, i, s = {}, o = typeof module != "undefined" && module.exports, u = /^\/?Date\((\-?\d+)/i, a = /(\[[^\[]*\])|(\\)?(Mo|MM?M?M?|Do|DDDo|DD?D?D?|ddd?d?|do?|w[o|w]?|W[o|W]?|YYYYY|YYYY|YY|a|A|hh?|HH?|mm?|ss?|SS?S?|X|zz?|ZZ?|.)/g, f = /(\[[^\[]*\])|(\\)?(LT|LL?L?L?|l{1,4})/g, l = /([0-9a-zA-Z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+)/gi, c = /\d\d?/, h = /\d{1,3}/, p = /\d{3}/, d = /\d{1,4}/, v = /[+\-]?\d{1,6}/, m = /[0-9]*[a-z\u00A0-\u05FF\u0700-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+|[\u0600-\u06FF]+\s*?[\u0600-\u06FF]+/i, g = /Z|[\+\-]\d\d:?\d\d/i, y = /T/i, b = /[\+\-]?\d+(\.\d{1,3})?/, w = /^\s*\d{4}-\d\d-\d\d((T| )(\d\d(:\d\d(:\d\d(\.\d\d?\d?)?)?)?)?([\+\-]\d\d:?\d\d)?)?/, E = "YYYY-MM-DDTHH:mm:ssZ", S = [
            ["HH:mm:ss.S", /(T| )\d\d:\d\d:\d\d\.\d{1,3}/],
            ["HH:mm:ss", /(T| )\d\d:\d\d:\d\d/],
            ["HH:mm", /(T| )\d\d:\d\d/],
            ["HH", /(T| )\d\d/]
        ], x = /([\+\-]|\d\d)/gi, T = "Month|Date|Hours|Minutes|Seconds|Milliseconds".split("|"), N = {Milliseconds: 1, Seconds: 1e3, Minutes: 6e4, Hours: 36e5, Days: 864e5, Months: 2592e6, Years: 31536e6}, C = {}, k = "DDD w W M D d".split(" "), L = "M D H h m s w W".split(" "), A = {M: function () {
            return this.month() + 1
        }, MMM: function (e) {
            return this.lang().monthsShort(this, e)
        }, MMMM: function (e) {
            return this.lang().months(this, e)
        }, D: function () {
            return this.date()
        }, DDD: function () {
            return this.dayOfYear()
        }, d: function () {
            return this.day()
        }, dd: function (e) {
            return this.lang().weekdaysMin(this, e)
        }, ddd: function (e) {
            return this.lang().weekdaysShort(this, e)
        }, dddd: function (e) {
            return this.lang().weekdays(this, e)
        }, w: function () {
            return this.week()
        }, W: function () {
            return this.isoWeek()
        }, YY: function () {
            return j(this.year() % 100, 2)
        }, YYYY: function () {
            return j(this.year(), 4)
        }, YYYYY: function () {
            return j(this.year(), 5)
        }, a: function () {
            return this.lang().meridiem(this.hours(), this.minutes(), !0)
        }, A: function () {
            return this.lang().meridiem(this.hours(), this.minutes(), !1)
        }, H: function () {
            return this.hours()
        }, h: function () {
            return this.hours() % 12 || 12
        }, m: function () {
            return this.minutes()
        }, s: function () {
            return this.seconds()
        }, S: function () {
            return~~(this.milliseconds() / 100)
        }, SS: function () {
            return j(~~(this.milliseconds() / 10), 2)
        }, SSS: function () {
            return j(this.milliseconds(), 3)
        }, Z: function () {
            var e = -this.zone(), t = "+";
            return e < 0 && (e = -e, t = "-"), t + j(~~(e / 60), 2) + ":" + j(~~e % 60, 2)
        }, ZZ: function () {
            var e = -this.zone(), t = "+";
            return e < 0 && (e = -e, t = "-"), t + j(~~(10 * e / 6), 4)
        }, X: function () {
            return this.unix()
        }};
        while (k.length)i = k.pop(), A[i + "o"] = M(A[i]);
        while (L.length)i = L.pop(), A[i + i] = O(A[i], 2);
        A.DDDD = O(A.DDD, 3), _.prototype = {set: function (e) {
            var t, n;
            for (n in e)t = e[n], typeof t == "function" ? this[n] = t : this["_" + n] = t
        }, _months: "January_February_March_April_May_June_July_August_September_October_November_December".split("_"), months: function (e) {
            return this._months[e.month()]
        }, _monthsShort: "Jan_Feb_Mar_Apr_May_Jun_Jul_Aug_Sep_Oct_Nov_Dec".split("_"), monthsShort: function (e) {
            return this._monthsShort[e.month()]
        }, monthsParse: function (e) {
            var n, r, i, s;
            this._monthsParse || (this._monthsParse = []);
            for (n = 0; n < 12; n++) {
                this._monthsParse[n] || (r = t([2e3, n]), i = "^" + this.months(r, "") + "|^" + this.monthsShort(r, ""), this._monthsParse[n] = new RegExp(i.replace(".", ""), "i"));
                if (this._monthsParse[n].test(e))return n
            }
        }, _weekdays: "Sunday_Monday_Tuesday_Wednesday_Thursday_Friday_Saturday".split("_"), weekdays: function (e) {
            return this._weekdays[e.day()]
        }, _weekdaysShort: "Sun_Mon_Tue_Wed_Thu_Fri_Sat".split("_"), weekdaysShort: function (e) {
            return this._weekdaysShort[e.day()]
        }, _weekdaysMin: "Su_Mo_Tu_We_Th_Fr_Sa".split("_"), weekdaysMin: function (e) {
            return this._weekdaysMin[e.day()]
        }, _longDateFormat: {LT: "h:mm A", L: "MM/DD/YYYY", LL: "MMMM D YYYY", LLL: "MMMM D YYYY LT", LLLL: "dddd, MMMM D YYYY LT"}, longDateFormat: function (e) {
            var t = this._longDateFormat[e];
            return!t && this._longDateFormat[e.toUpperCase()] && (t = this._longDateFormat[e.toUpperCase()].replace(/MMMM|MM|DD|dddd/g, function (e) {
                return e.slice(1)
            }), this._longDateFormat[e] = t), t
        }, meridiem: function (e, t, n) {
            return e > 11 ? n ? "pm" : "PM" : n ? "am" : "AM"
        }, _calendar: {sameDay: "[Today at] LT", nextDay: "[Tomorrow at] LT", nextWeek: "dddd [at] LT", lastDay: "[Yesterday at] LT", lastWeek: "[last] dddd [at] LT", sameElse: "L"}, calendar: function (e, t) {
            var n = this._calendar[e];
            return typeof n == "function" ? n.apply(t) : n
        }, _relativeTime: {future: "in %s", past: "%s ago", s: "a few seconds", m: "a minute", mm: "%d minutes", h: "an hour", hh: "%d hours", d: "a day", dd: "%d days", M: "a month", MM: "%d months", y: "a year", yy: "%d years"}, relativeTime: function (e, t, n, r) {
            var i = this._relativeTime[n];
            return typeof i == "function" ? i(e, t, n, r) : i.replace(/%d/i, e)
        }, pastFuture: function (e, t) {
            var n = this._relativeTime[e > 0 ? "future" : "past"];
            return typeof n == "function" ? n(t) : n.replace(/%s/i, t)
        }, ordinal: function (e) {
            return this._ordinal.replace("%d", e)
        }, _ordinal: "%d", preparse: function (e) {
            return e
        }, postformat: function (e) {
            return e
        }, week: function (e) {
            return tt(e, this._week.dow, this._week.doy)
        }, _week: {dow: 0, doy: 6}}, t = function (e, t, n) {
            return nt({_i: e, _f: t, _l: n, _isUTC: !1})
        }, t.utc = function (e, t, n) {
            return nt({_useUTC: !0, _isUTC: !0, _l: n, _i: e, _f: t})
        }, t.unix = function (e) {
            return t(e * 1e3)
        }, t.duration = function (e, n) {
            var r = t.isDuration(e), i = typeof e == "number", s = r ? e._data : i ? {} : e, o;
            return i && (n ? s[n] = e : s.milliseconds = e), o = new P(s), r && e.hasOwnProperty("_lang") && (o._lang = e._lang), o
        }, t.version = n, t.defaultFormat = E, t.lang = function (e, n) {
            var r;
            if (!e)return t.fn._lang._abbr;
            n ? R(e, n) : s[e] || U(e), t.duration.fn._lang = t.fn._lang = U(e)
        }, t.langData = function (e) {
            return e && e._lang && e._lang._abbr && (e = e._lang._abbr), U(e)
        }, t.isMoment = function (e) {
            return e instanceof D
        }, t.isDuration = function (e) {
            return e instanceof P
        }, t.fn = D.prototype = {clone: function () {
            return t(this)
        }, valueOf: function () {
            return+this._d
        }, unix: function () {
            return Math.floor(+this._d / 1e3)
        }, toString: function () {
            return this.format("ddd MMM DD YYYY HH:mm:ss [GMT]ZZ")
        }, toDate: function () {
            return this._d
        }, toJSON: function () {
            return t.utc(this).format("YYYY-MM-DD[T]HH:mm:ss.SSS[Z]")
        }, toArray: function () {
            var e = this;
            return[e.year(), e.month(), e.date(), e.hours(), e.minutes(), e.seconds(), e.milliseconds()]
        }, isValid: function () {
            return this._isValid == null && (this._a ? this._isValid = !q(this._a, (this._isUTC ? t.utc(this._a) : t(this._a)).toArray()) : this._isValid = !isNaN(this._d.getTime())), !!this._isValid
        }, utc: function () {
            return this._isUTC = !0, this
        }, local: function () {
            return this._isUTC = !1, this
        }, format: function (e) {
            var n = X(this, e || t.defaultFormat);
            return this.lang().postformat(n)
        }, add: function (e, n) {
            var r;
            return typeof e == "string" ? r = t.duration(+n, e) : r = t.duration(e, n), F(this, r, 1), this
        }, subtract: function (e, n) {
            var r;
            return typeof e == "string" ? r = t.duration(+n, e) : r = t.duration(e, n), F(this, r, -1), this
        }, diff: function (e, n, r) {
            var i = this._isUTC ? t(e).utc() : t(e).local(), s = (this.zone() - i.zone()) * 6e4, o, u;
            return n && (n = n.replace(/s$/, "")), n === "year" || n === "month" ? (o = (this.daysInMonth() + i.daysInMonth()) * 432e5, u = (this.year() - i.year()) * 12 + (this.month() - i.month()), u += (this - t(this).startOf("month") - (i - t(i).startOf("month"))) / o, n === "year" && (u /= 12)) : (o = this - i - s, u = n === "second" ? o / 1e3 : n === "minute" ? o / 6e4 : n === "hour" ? o / 36e5 : n === "day" ? o / 864e5 : n === "week" ? o / 6048e5 : o), r ? u : B(u)
        }, from: function (e, n) {
            return t.duration(this.diff(e)).lang(this.lang()._abbr).humanize(!n)
        }, fromNow: function (e) {
            return this.from(t(), e)
        }, calendar: function () {
            var e = this.diff(t().startOf("day"), "days", !0), n = e < -6 ? "sameElse" : e < -1 ? "lastWeek" : e < 0 ? "lastDay" : e < 1 ? "sameDay" : e < 2 ? "nextDay" : e < 7 ? "nextWeek" : "sameElse";
            return this.format(this.lang().calendar(n, this))
        }, isLeapYear: function () {
            var e = this.year();
            return e % 4 === 0 && e % 100 !== 0 || e % 400 === 0
        }, isDST: function () {
            return this.zone() < t([this.year()]).zone() || this.zone() < t([this.year(), 5]).zone()
        }, day: function (e) {
            var t = this._isUTC ? this._d.getUTCDay() : this._d.getDay();
            return e == null ? t : this.add({d: e - t})
        }, startOf: function (e) {
            e = e.replace(/s$/, "");
            switch (e) {
                case"year":
                    this.month(0);
                case"month":
                    this.date(1);
                case"week":
                case"day":
                    this.hours(0);
                case"hour":
                    this.minutes(0);
                case"minute":
                    this.seconds(0);
                case"second":
                    this.milliseconds(0)
            }
            return e === "week" && this.day(0), this
        }, endOf: function (e) {
            return this.startOf(e).add(e.replace(/s?$/, "s"), 1).subtract("ms", 1)
        }, isAfter: function (e, n) {
            return n = typeof n != "undefined" ? n : "millisecond", +this.clone().startOf(n) > +t(e).startOf(n)
        }, isBefore: function (e, n) {
            return n = typeof n != "undefined" ? n : "millisecond", +this.clone().startOf(n) < +t(e).startOf(n)
        }, isSame: function (e, n) {
            return n = typeof n != "undefined" ? n : "millisecond", +this.clone().startOf(n) === +t(e).startOf(n)
        }, zone: function () {
            return this._isUTC ? 0 : this._d.getTimezoneOffset()
        }, daysInMonth: function () {
            return t.utc([this.year(), this.month() + 1, 0]).date()
        }, dayOfYear: function (e) {
            var n = r((t(this).startOf("day") - t(this).startOf("year")) / 864e5) + 1;
            return e == null ? n : this.add("d", e - n)
        }, isoWeek: function (e) {
            var t = tt(this, 1, 4);
            return e == null ? t : this.add("d", (e - t) * 7)
        }, week: function (e) {
            var t = this.lang().week(this);
            return e == null ? t : this.add("d", (e - t) * 7)
        }, lang: function (t) {
            return t === e ? this._lang : (this._lang = U(t), this)
        }};
        for (i = 0; i < T.length; i++)rt(T[i].toLowerCase().replace(/s$/, ""), T[i]);
        rt("year", "FullYear"), t.fn.days = t.fn.day, t.fn.weeks = t.fn.week, t.fn.isoWeeks = t.fn.isoWeek, t.duration.fn = P.prototype = {weeks: function () {
            return B(this.days() / 7)
        }, valueOf: function () {
            return this._milliseconds + this._days * 864e5 + this._months * 2592e6
        }, humanize: function (e) {
            var t = +this, n = et(t, !e, this.lang());
            return e && (n = this.lang().pastFuture(t, n)), this.lang().postformat(n)
        }, lang: t.fn.lang};
        for (i in N)N.hasOwnProperty(i) && (st(i, N[i]), it(i.toLowerCase()));
        st("Weeks", 6048e5), t.lang("en", {ordinal: function (e) {
            var t = e % 10, n = ~~(e % 100 / 10) === 1 ? "th" : t === 1 ? "st" : t === 2 ? "nd" : t === 3 ? "rd" : "th";
            return e + n
        }}), o && (module.exports = t), typeof ender == "undefined" && (this.moment = t), typeof define == "function" && define.amd && define("moment", [], function () {
            return t
        })
    }).call(this);

    /**
     * @version: 1.2
     * @author: Dan Grossman http://www.dangrossman.info/
     * @date: 2013-07-25
     * @copyright: Copyright (c) 2012-2013 Dan Grossman. All rights reserved.
     * @license: Licensed under Apache License v2.0. See http://www.apache.org/licenses/LICENSE-2.0
     * @website: http://www.improvely.com/
     */
    !function ($) {

        var DateRangePicker = function (element, options, cb) {
            var hasOptions = typeof options == 'object';
            var localeObject;

            //option defaults

            this.startDate = moment().startOf('day');
            this.endDate = moment().startOf('day');
            this.minDate = false;
            this.maxDate = false;
            this.dateLimit = false;

            this.showDropdowns = false;
            this.showWeekNumbers = false;
            this.timePicker = false;
            this.timePickerIncrement = 30;
            this.timePicker12Hour = true;
            this.ranges = {};
            this.opens = 'right';

            this.buttonClasses = ['btn', 'btn-small'];
            this.applyClass = 'btn-success';
            this.cancelClass = 'btn-default';

            this.format = 'MM/DD/YYYY';
            this.separator = ' - ';

            this.locale = {
                applyLabel: 'Apply',
                cancelLabel: 'Cancel',
                fromLabel: 'From',
                toLabel: 'To',
                weekLabel: 'W',
                customRangeLabel: 'Custom Range',
                daysOfWeek: moment()._lang._weekdaysMin,
                monthNames: moment()._lang._monthsShort,
                firstDay: 0
            };

            this.cb = function () {
            };

            //element that triggered the date range picker
            this.element = $(element);

            if (this.element.hasClass('pull-right'))
                this.opens = 'left';

            if (this.element.is('input')) {
                this.element.on({
                    click: $.proxy(this.show, this),
                    focus: $.proxy(this.show, this)
                });
            } else {
                this.element.on('click', $.proxy(this.show, this));
            }

            localeObject = this.locale;

            if (hasOptions) {
                if (typeof options.locale == 'object') {
                    $.each(localeObject, function (property, value) {
                        localeObject[property] = options.locale[property] || value;
                    });
                }

                if (options.applyClass) {
                    this.applyClass = options.applyClass;
                }

                if (options.cancelClass) {
                    this.cancelClass = options.cancelClass;
                }
            }

            var DRPTemplate = '<div class="daterangepicker dropdown-menu">' +
                    '<div class="calendar left"></div>' +
                    '<div class="calendar right"></div>' +
                    '<div class="ranges">' +
                    '<div class="range_inputs">' +
                    '<div class="daterangepicker_start_input" style="float: left">' +
                    '<label for="daterangepicker_start">' + this.locale.fromLabel + '</label>' +
                    '<input class="input-mini" type="text" name="daterangepicker_start" value="" disabled="disabled" />' +
                    '</div>' +
                    '<div class="daterangepicker_end_input" style="float: left; padding-left: 11px">' +
                    '<label for="daterangepicker_end">' + this.locale.toLabel + '</label>' +
                    '<input class="input-mini" type="text" name="daterangepicker_end" value="" disabled="disabled" />' +
                    '</div>' +
                    '<button class="' + this.applyClass + ' applyBtn" disabled="disabled">' + this.locale.applyLabel + '</button>&nbsp;' +
                    '<button class="' + this.cancelClass + ' cancelBtn">' + this.locale.cancelLabel + '</button>' +
                    '</div>' +
                    '</div>' +
                    '</div>';

            this.container = $(DRPTemplate).appendTo('body');

            if (hasOptions) {

                if (typeof options.format == 'string')
                    this.format = options.format;

                if (typeof options.separator == 'string')
                    this.separator = options.separator;

                if (typeof options.startDate == 'string')
                    this.startDate = moment(options.startDate, this.format);

                if (typeof options.endDate == 'string')
                    this.endDate = moment(options.endDate, this.format);

                if (typeof options.minDate == 'string')
                    this.minDate = moment(options.minDate, this.format);

                if (typeof options.maxDate == 'string')
                    this.maxDate = moment(options.maxDate, this.format);

                if (typeof options.startDate == 'object')
                    this.startDate = moment(options.startDate);

                if (typeof options.endDate == 'object')
                    this.endDate = moment(options.endDate);

                if (typeof options.minDate == 'object')
                    this.minDate = moment(options.minDate);

                if (typeof options.maxDate == 'object')
                    this.maxDate = moment(options.maxDate);

                if (typeof options.ranges == 'object') {
                    for (var range in options.ranges) {

                        var start = moment(options.ranges[range][0]);
                        var end = moment(options.ranges[range][1]);

                        // If we have a min/max date set, bound this range
                        // to it, but only if it would otherwise fall
                        // outside of the min/max.
                        if (this.minDate && start.isBefore(this.minDate))
                            start = moment(this.minDate);

                        if (this.maxDate && end.isAfter(this.maxDate))
                            end = moment(this.maxDate);

                        // If the end of the range is before the minimum (if min is set) OR
                        // the start of the range is after the max (also if set) don't display this
                        // range option.
                        if ((this.minDate && end.isBefore(this.minDate)) || (this.maxDate && start.isAfter(this.maxDate))) {
                            continue;
                        }

                        this.ranges[range] = [start, end];
                    }

                    var list = '<ul>';
                    for (var range in this.ranges) {
                        list += '<li>' + range + '</li>';
                    }
                    list += '<li>' + this.locale.customRangeLabel + '</li>';
                    list += '</ul>';
                    this.container.find('.ranges').prepend(list);
                }

                if (typeof options.dateLimit == 'object')
                    this.dateLimit = options.dateLimit;

                // update day names order to firstDay
                if (typeof options.locale == 'object') {
                    if (typeof options.locale.firstDay == 'number') {
                        this.locale.firstDay = options.locale.firstDay;
                        var iterator = options.locale.firstDay;
                        while (iterator > 0) {
                            this.locale.daysOfWeek.push(this.locale.daysOfWeek.shift());
                            iterator--;
                        }
                    }
                }

                if (typeof options.opens == 'string')
                    this.opens = options.opens;

                if (typeof options.showWeekNumbers == 'boolean') {
                    this.showWeekNumbers = options.showWeekNumbers;
                }

                if (typeof options.buttonClasses == 'string') {
                    this.buttonClasses = [options.buttonClasses];
                }

                if (typeof options.buttonClasses == 'object') {
                    this.buttonClasses = options.buttonClasses;
                }

                if (typeof options.showDropdowns == 'boolean') {
                    this.showDropdowns = options.showDropdowns;
                }

                if (typeof options.timePicker == 'boolean') {
                    this.timePicker = options.timePicker;
                }

                if (typeof options.timePickerIncrement == 'number') {
                    this.timePickerIncrement = options.timePickerIncrement;
                }

                if (typeof options.timePicker12Hour == 'boolean') {
                    this.timePicker12Hour = options.timePicker12Hour;
                }

            }

            if (!this.timePicker) {
                this.startDate = this.startDate.startOf('day');
                this.endDate = this.endDate.startOf('day');
            }

            //apply CSS classes to buttons
            var c = this.container;
            $.each(this.buttonClasses, function (idx, val) {
                c.find('button').addClass(val);
            });

            if (this.opens == 'right') {
                //swap calendar positions
                var left = this.container.find('.calendar.left');
                var right = this.container.find('.calendar.right');
                left.removeClass('left').addClass('right');
                right.removeClass('right').addClass('left');
            }

            if (typeof options == 'undefined' || typeof options.ranges == 'undefined') {
                this.container.find('.calendar').show();
                this.move();
            }

            if (typeof cb == 'function')
                this.cb = cb;

            this.container.addClass('opens' + this.opens);

            //try parse date if in text input
            if (!hasOptions || (typeof options.startDate == 'undefined' && typeof options.endDate == 'undefined')) {
                if ($(this.element).is('input[type=text]')) {
                    var val = $(this.element).val();
                    var split = val.split(this.separator);
                    var start, end;
                    if (split.length == 2) {
                        start = moment(split[0], this.format);
                        end = moment(split[1], this.format);
                    }
                    if (start != null && end != null) {
                        this.startDate = start;
                        this.endDate = end;
                    }
                }
            }

            //state
            this.oldStartDate = this.startDate;
            this.oldEndDate = this.endDate;

            this.leftCalendar = {
                month: moment([this.startDate.year(), this.startDate.month(), 1, this.startDate.hour(), this.startDate.minute()]),
                calendar: []
            };

            this.rightCalendar = {
                month: moment([this.endDate.year(), this.endDate.month(), 1, this.endDate.hour(), this.endDate.minute()]),
                calendar: []
            };

            //event listeners
            this.container.on('mousedown', $.proxy(this.mousedown, this));
            this.container.find('.calendar').on('click', '.prev', $.proxy(this.clickPrev, this));
            this.container.find('.calendar').on('click', '.next', $.proxy(this.clickNext, this));
            this.container.find('.ranges').on('click', 'button.applyBtn', $.proxy(this.clickApply, this));
            this.container.find('.ranges').on('click', 'button.cancelBtn', $.proxy(this.clickCancel, this));

            this.container.find('.calendar').on('click', 'td.available', $.proxy(this.clickDate, this));
            this.container.find('.calendar').on('mouseenter', 'td.available', $.proxy(this.enterDate, this));
            this.container.find('.calendar').on('mouseleave', 'td.available', $.proxy(this.updateView, this));

            this.container.find('.ranges').on('click', 'li', $.proxy(this.clickRange, this));
            this.container.find('.ranges').on('mouseenter', 'li', $.proxy(this.enterRange, this));
            this.container.find('.ranges').on('mouseleave', 'li', $.proxy(this.updateView, this));

            this.container.find('.calendar').on('change', 'select.yearselect', $.proxy(this.updateYear, this));
            this.container.find('.calendar').on('change', 'select.monthselect', $.proxy(this.updateMonth, this));

            this.container.find('.calendar').on('change', 'select.hourselect', $.proxy(this.updateTime, this));
            this.container.find('.calendar').on('change', 'select.minuteselect', $.proxy(this.updateTime, this));
            this.container.find('.calendar').on('change', 'select.ampmselect', $.proxy(this.updateTime, this));

            this.element.on('keyup', $.proxy(this.updateFromControl, this));

            this.updateView();
            this.updateCalendars();

        };

        DateRangePicker.prototype = {

            constructor: DateRangePicker,

            mousedown: function (e) {
                e.stopPropagation();
            },

            updateView: function () {
                this.leftCalendar.month.month(this.startDate.month()).year(this.startDate.year());
                this.rightCalendar.month.month(this.endDate.month()).year(this.endDate.year());

                this.container.find('input[name=daterangepicker_start]').val(this.startDate.format(this.format));
                this.container.find('input[name=daterangepicker_end]').val(this.endDate.format(this.format));

                if (this.startDate.isSame(this.endDate) || this.startDate.isBefore(this.endDate)) {
                    this.container.find('button.applyBtn').removeAttr('disabled');
                } else {
                    this.container.find('button.applyBtn').attr('disabled', 'disabled');
                }
            },

            updateFromControl: function () {
                if (!this.element.is('input')) return;
                if (!this.element.val().length) return;

                var dateString = this.element.val().split(this.separator);
                var start = moment(dateString[0], this.format);
                var end = moment(dateString[1], this.format);

                if (start == null || end == null) return;
                if (end.isBefore(start)) return;

                this.startDate = start;
                this.endDate = end;

                this.updateView();
                this.cb(this.startDate, this.endDate);
                this.updateCalendars();
            },

            notify: function () {
                this.updateView();
                this.cb(this.startDate, this.endDate);
            },

            move: function () {
                var minWidth = $(this.container).find('.ranges').outerWidth();
                if ($(this.container).find('.calendar').is(':visible')) {
                    var padding = 24; // FIXME: this works for the default styling, but isn't flexible
                    minWidth += $(this.container).find('.calendar').outerWidth() * 2 + padding;
                }
                if (this.opens == 'left') {
                    this.container.css({
                        top: this.element.offset().top + this.element.outerHeight(),
                        right: $(window).width() - this.element.offset().left - this.element.outerWidth(),
                        left: 'auto',
                        'min-width': minWidth
                    });
                    if (this.container.offset().left < 0) {
                        this.container.css({
                            right: 'auto',
                            left: 9
                        });
                    }
                } else {
                    this.container.css({
                        top: this.element.offset().top + this.element.outerHeight(),
                        left: this.element.offset().left,
                        right: 'auto',
                        'min-width': minWidth
                    });
                    if (this.container.offset().left + this.container.outerWidth() > $(window).width()) {
                        this.container.css({
                            left: 'auto',
                            right: 0
                        });
                    }
                }
            },

            show: function (e) {
                this.container.show();
                this.move();

                if (e) {
                    e.stopPropagation();
                    e.preventDefault();
                }

                this.oldStartDate = this.startDate;
                this.oldEndDate = this.endDate;

                $(document).on('mousedown', $.proxy(this.hide, this));
                this.element.trigger('shown', {target: e.target, picker: this});
            },

            hide: function (e) {
                this.container.hide();

                if (!this.startDate.isSame(this.oldStartDate) || !this.endDate.isSame(this.oldEndDate))
                    this.notify();

                $(document).off('mousedown', this.hide);
                this.element.trigger('hidden', { picker: this });
            },

            enterRange: function (e) {
                var label = e.target.innerHTML;
                if (label == this.locale.customRangeLabel) {
                    this.updateView();
                } else {
                    var dates = this.ranges[label];
                    this.container.find('input[name=daterangepicker_start]').val(dates[0].format(this.format));
                    this.container.find('input[name=daterangepicker_end]').val(dates[1].format(this.format));
                }
            },

            clickRange: function (e) {
                var label = e.target.innerHTML;
                if (label == this.locale.customRangeLabel) {
                    this.container.find('.calendar').show();
                    this.move();
                } else {
                    var dates = this.ranges[label];

                    this.startDate = dates[0];
                    this.endDate = dates[1];

                    if (!this.timePicker) {
                        this.startDate.startOf('day');
                        this.endDate.startOf('day');
                    }

                    this.leftCalendar.month.month(this.startDate.month()).year(this.startDate.year()).hour(this.startDate.hour()).minute(this.startDate.minute());
                    this.rightCalendar.month.month(this.endDate.month()).year(this.endDate.year()).hour(this.endDate.hour()).minute(this.endDate.minute());
                    this.updateCalendars();

                    if (this.element.is('input'))
                        this.element.val(this.startDate.format(this.format) + this.separator + this.endDate.format(this.format));

                    this.container.find('.calendar').hide();
                    this.hide();
                }
            },

            clickPrev: function (e) {
                var cal = $(e.target).parents('.calendar');
                if (cal.hasClass('left')) {
                    this.leftCalendar.month.subtract('month', 1);
                } else {
                    this.rightCalendar.month.subtract('month', 1);
                }
                this.updateCalendars();
            },

            clickNext: function (e) {
                var cal = $(e.target).parents('.calendar');
                if (cal.hasClass('left')) {
                    this.leftCalendar.month.add('month', 1);
                } else {
                    this.rightCalendar.month.add('month', 1);
                }
                this.updateCalendars();
            },

            enterDate: function (e) {

                var title = $(e.target).attr('data-title');
                var row = title.substr(1, 1);
                var col = title.substr(3, 1);
                var cal = $(e.target).parents('.calendar');

                if (cal.hasClass('left')) {
                    this.container.find('input[name=daterangepicker_start]').val(this.leftCalendar.calendar[row][col].format(this.format));
                } else {
                    this.container.find('input[name=daterangepicker_end]').val(this.rightCalendar.calendar[row][col].format(this.format));
                }

            },

            clickDate: function (e) {
                var title = $(e.target).attr('data-title');
                var row = title.substr(1, 1);
                var col = title.substr(3, 1);
                var cal = $(e.target).parents('.calendar');

                if (cal.hasClass('left')) {
                    var startDate = this.leftCalendar.calendar[row][col];
                    var endDate = this.endDate;
                    if (typeof this.dateLimit == 'object') {
                        var maxDate = moment(startDate).add(this.dateLimit).startOf('day');
                        if (endDate.isAfter(maxDate)) {
                            endDate = maxDate;
                        }
                    }
                } else {
                    var startDate = this.startDate;
                    var endDate = this.rightCalendar.calendar[row][col];
                    if (typeof this.dateLimit == 'object') {
                        var minDate = moment(endDate).subtract(this.dateLimit).startOf('day');
                        if (startDate.isBefore(minDate)) {
                            startDate = minDate;
                        }
                    }
                }

                cal.find('td').removeClass('active');

                if (startDate.isSame(endDate) || startDate.isBefore(endDate)) {
                    $(e.target).addClass('active');
                    this.startDate = startDate;
                    this.endDate = endDate;
                } else if (startDate.isAfter(endDate)) {
                    $(e.target).addClass('active');
                    this.startDate = startDate;
                    this.endDate = moment(startDate).add('day', 1).startOf('day');
                }

                this.leftCalendar.month.month(this.startDate.month()).year(this.startDate.year());
                this.rightCalendar.month.month(this.endDate.month()).year(this.endDate.year());
                this.updateCalendars();
            },

            clickApply: function (e) {
                if (this.element.is('input'))
                    this.element.val(this.startDate.format(this.format) + this.separator + this.endDate.format(this.format));
                this.hide();
            },

            clickCancel: function (e) {
                this.startDate = this.oldStartDate;
                this.endDate = this.oldEndDate;
                this.updateView();
                this.updateCalendars();
                this.hide();
            },

            updateYear: function (e) {
                var year = parseInt($(e.target).val());
                var isLeft = $(e.target).closest('.calendar').hasClass('left');

                if (isLeft) {
                    this.leftCalendar.month.month(this.startDate.month()).year(year);
                } else {
                    this.rightCalendar.month.month(this.endDate.month()).year(year);
                }

                this.updateCalendars();
            },

            updateMonth: function (e) {
                var month = parseInt($(e.target).val());
                var isLeft = $(e.target).closest('.calendar').hasClass('left');

                if (isLeft) {
                    this.leftCalendar.month.month(month).year(this.startDate.year());
                } else {
                    this.rightCalendar.month.month(month).year(this.endDate.year());
                }
                this.updateCalendars();
            },

            updateTime: function (e) {

                var isLeft = $(e.target).closest('.calendar').hasClass('left');
                var cal = this.container.find('.calendar.left');
                if (!isLeft)
                    cal = this.container.find('.calendar.right');

                var hour = parseInt(cal.find('.hourselect').val());
                var minute = parseInt(cal.find('.minuteselect').val());

                if (this.timePicker12Hour) {
                    var ampm = cal.find('.ampmselect').val();
                    if (ampm == 'PM' && hour < 12)
                        hour += 12;
                }

                if (isLeft) {
                    var start = this.startDate;
                    start.hour(hour);
                    start.minute(minute);
                    this.startDate = start;
                    this.leftCalendar.month.hour(hour).minute(minute);
                } else {
                    var end = this.endDate;
                    end.hour(hour);
                    end.minute(minute);
                    this.endDate = end;
                    this.rightCalendar.month.hour(hour).minute(minute);
                }

                this.updateCalendars();

            },

            updateCalendars: function () {
                this.leftCalendar.calendar = this.buildCalendar(this.leftCalendar.month.month(), this.leftCalendar.month.year(), this.leftCalendar.month.hour(), this.leftCalendar.month.minute(), 'left');
                this.rightCalendar.calendar = this.buildCalendar(this.rightCalendar.month.month(), this.rightCalendar.month.year(), this.rightCalendar.month.hour(), this.rightCalendar.month.minute(), 'right');
                this.container.find('.calendar.left').html(this.renderCalendar(this.leftCalendar.calendar, this.startDate, this.minDate, this.maxDate));
                this.container.find('.calendar.right').html(this.renderCalendar(this.rightCalendar.calendar, this.endDate, this.startDate, this.maxDate));

                this.container.find('.ranges li').removeClass('active');
                var customRange = true;
                var i = 0;
                for (var range in this.ranges) {
                    if (this.timePicker) {
                        if (this.startDate.isSame(this.ranges[range][0]) && this.endDate.isSame(this.ranges[range][1])) {
                            customRange = false;
                            this.container.find('.ranges li:eq(' + i + ')').addClass('active');
                        }
                    } else {
                        //ignore times when comparing dates if time picker is not enabled
                        if (this.startDate.format('YYYY-MM-DD') == this.ranges[range][0].format('YYYY-MM-DD') && this.endDate.format('YYYY-MM-DD') == this.ranges[range][1].format('YYYY-MM-DD')) {
                            customRange = false;
                            this.container.find('.ranges li:eq(' + i + ')').addClass('active');
                        }
                    }
                    i++;
                }
                if (customRange)
                    this.container.find('.ranges li:last').addClass('active');
            },

            buildCalendar: function (month, year, hour, minute, side) {

                var firstDay = moment([year, month, 1]);
                var lastMonth = moment(firstDay).subtract('month', 1).month();
                var lastYear = moment(firstDay).subtract('month', 1).year();

                var daysInLastMonth = moment([lastYear, lastMonth]).daysInMonth();

                var dayOfWeek = firstDay.day();

                //initialize a 6 rows x 7 columns array for the calendar
                var calendar = [];
                for (var i = 0; i < 6; i++) {
                    calendar[i] = [];
                }

                //populate the calendar with date objects
                var startDay = daysInLastMonth - dayOfWeek + this.locale.firstDay + 1;
                if (startDay > daysInLastMonth)
                    startDay -= 7;

                if (dayOfWeek == this.locale.firstDay)
                    startDay = daysInLastMonth - 6;

                var curDate = moment([lastYear, lastMonth, startDay, hour, minute]);
                for (var i = 0, col = 0, row = 0; i < 42; i++, col++, curDate = moment(curDate).add('day', 1)) {
                    if (i > 0 && col % 7 == 0) {
                        col = 0;
                        row++;
                    }
                    calendar[row][col] = curDate;
                }

                return calendar;

            },

            renderDropdowns: function (selected, minDate, maxDate) {
                var currentMonth = selected.month();
                var monthHtml = '<select class="monthselect">';
                var inMinYear = false;
                var inMaxYear = false;

                for (var m = 0; m < 12; m++) {
                    if ((!inMinYear || m >= minDate.month()) && (!inMaxYear || m <= maxDate.month())) {
                        monthHtml += "<option value='" + m + "'" +
                                (m === currentMonth ? " selected='selected'" : "") +
                                ">" + this.locale.monthNames[m] + "</option>";
                    }
                }
                monthHtml += "</select>";

                var currentYear = selected.year();
                var maxYear = (maxDate && maxDate.year()) || (currentYear + 5);
                var minYear = (minDate && minDate.year()) || (currentYear - 50);
                var yearHtml = '<select class="yearselect">'

                for (var y = minYear; y <= maxYear; y++) {
                    yearHtml += '<option value="' + y + '"' +
                            (y === currentYear ? ' selected="selected"' : '') +
                            '>' + y + '</option>';
                }

                yearHtml += '</select>';

                return monthHtml + yearHtml;
            },

            renderCalendar: function (calendar, selected, minDate, maxDate) {

                var html = '<div class="calendar-date">';
                html += '<table class="table-condensed">';
                html += '<thead>';
                html += '<tr>';

                // add empty cell for week number
                if (this.showWeekNumbers)
                    html += '<th></th>';

                if (!minDate || minDate.isBefore(calendar[1][1])) {
                    html += '<th class="prev available"><i class="icon-arrow-left"></i></th>';
                } else {
                    html += '<th></th>';
                }

                var dateHtml = this.locale.monthNames[calendar[1][1].month()] + calendar[1][1].format(" YYYY");

                if (this.showDropdowns) {
                    dateHtml = this.renderDropdowns(calendar[1][1], minDate, maxDate);
                }

                html += '<th colspan="5" style="width: auto">' + dateHtml + '</th>';
                if (!maxDate || maxDate.isAfter(calendar[1][1])) {
                    html += '<th class="next available"><i class="icon-arrow-right"></i></th>';
                } else {
                    html += '<th></th>';
                }

                html += '</tr>';
                html += '<tr>';

                // add week number label
                if (this.showWeekNumbers)
                    html += '<th class="week">' + this.locale.weekLabel + '</th>';

                $.each(this.locale.daysOfWeek, function (index, dayOfWeek) {
                    html += '<th>' + dayOfWeek + '</th>';
                });

                html += '</tr>';
                html += '</thead>';
                html += '<tbody>';

                for (var row = 0; row < 6; row++) {
                    html += '<tr>';

                    // add week number
                    if (this.showWeekNumbers)
                        html += '<td class="week">' + calendar[row][0].week() + '</td>';

                    for (var col = 0; col < 7; col++) {
                        var cname = 'available ';
                        cname += (calendar[row][col].month() == calendar[1][1].month()) ? '' : 'off';

                        if ((minDate && calendar[row][col].isBefore(minDate)) || (maxDate && calendar[row][col].isAfter(maxDate))) {
                            cname = ' off disabled ';
                        } else if (calendar[row][col].format('YYYY-MM-DD') == selected.format('YYYY-MM-DD')) {
                            cname += ' active ';
                            if (calendar[row][col].format('YYYY-MM-DD') == this.startDate.format('YYYY-MM-DD')) {
                                cname += ' start-date ';
                            }
                            if (calendar[row][col].format('YYYY-MM-DD') == this.endDate.format('YYYY-MM-DD')) {
                                cname += ' end-date ';
                            }
                        } else if (calendar[row][col] >= this.startDate && calendar[row][col] <= this.endDate) {
                            cname += ' in-range ';
                            if (calendar[row][col].isSame(this.startDate)) {
                                cname += ' start-date ';
                            }
                            if (calendar[row][col].isSame(this.endDate)) {
                                cname += ' end-date ';
                            }
                        }

                        var title = 'r' + row + 'c' + col;
                        html += '<td class="' + cname.replace(/\s+/g, ' ').replace(/^\s?(.*?)\s?$/, '$1') + '" data-title="' + title + '">' + calendar[row][col].date() + '</td>';
                    }
                    html += '</tr>';
                }

                html += '</tbody>';
                html += '</table>';
                html += '</div>';

                if (this.timePicker) {

                    html += '<div class="calendar-time">';
                    html += '<select class="hourselect">';
                    var start = 0;
                    var end = 23;
                    var selected_hour = selected.hour();
                    if (this.timePicker12Hour) {
                        start = 1;
                        end = 12;
                        if (selected_hour >= 12)
                            selected_hour -= 12;
                        if (selected_hour == 0)
                            selected_hour = 12;
                    }

                    for (var i = start; i <= end; i++) {
                        if (i == selected_hour) {
                            html += '<option value="' + i + '" selected="selected">' + i + '</option>';
                        } else {
                            html += '<option value="' + i + '">' + i + '</option>';
                        }
                    }

                    html += '</select> : ';

                    html += '<select class="minuteselect">';

                    for (var i = 0; i < 60; i += this.timePickerIncrement) {
                        var num = i;
                        if (num < 10)
                            num = '0' + num;
                        if (i == selected.minute()) {
                            html += '<option value="' + i + '" selected="selected">' + num + '</option>';
                        } else {
                            html += '<option value="' + i + '">' + num + '</option>';
                        }
                    }

                    html += '</select> ';

                    if (this.timePicker12Hour) {
                        html += '<select class="ampmselect">';
                        if (selected.hour() >= 12) {
                            html += '<option value="AM">AM</option><option value="PM" selected="selected">PM</option>';
                        } else {
                            html += '<option value="AM" selected="selected">AM</option><option value="PM">PM</option>';
                        }
                        html += '</select>';
                    }
                    html += '</div>';
                }
                return html;
            }
        };

        $.fn.daterangepicker = function (options, cb) {
            this.each(function () {
                var el = $(this);
                if (!el.data('daterangepicker'))
                    el.data('daterangepicker', new DateRangePicker(el, options, cb));
            });
            return this;
        };

    }(window.jQuery);
</r:script>

<div class="controls">
    <div class="input-prepend">
        <span class="add-on"><i class="icon-calendar"></i></span>
        <input type="text" style="width: 300px" name="range" id="reservationtime"
               value="${campaignsInstance?.range}" class="span4"/>
        <span class="help-inline">${hasErrors(bean: campaignsInstance, field: 'range', 'error')}</span>
    </div>
</div>

<script type="text/javascript">
    $(document).ready(function () {
        $('#reservationtime').daterangepicker({
            timePicker: true,
            timePickerIncrement: 30,
            format: 'MM/DD/YYYY',
            constrainInput: true,
            buttonImageOnly: true
        });
    });

    $("#reservationtime").attr('readOnly', 'true');
</script>




