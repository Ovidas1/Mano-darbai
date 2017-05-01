$(document).ready(function() {
    var ctx = document.getElementById("myChart");
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ["Perskaičiau Knygų", "Pažiūrėjau Filmų"],
            datasets: [{
                label: 'Kiek per mėnesį aš:',
                data: [0, 20],
                backgroundColor: [
                    '#90908C',
                    '#A01E1E'
                ],
                borderColor: [
                    '#383730',
                    '#400C0C'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero:true
                    }
                }]
            }
        }
    });
    var ctx = document.getElementById("mChart");
    var myPieChart = new Chart(ctx,{
    type: 'pie',
    data: {
        labels: [
            "Miegas",
            "Darbas",
            "Laisvalaikis"
        ],
        datasets: [
            {
                data: [8, 9, 7],
                backgroundColor: [
                    "#E77600",
                    "#E8AD14",
                    "#613106"
                ],
                hoverBackgroundColor: [
                    "#E77600",
                    "#E8AD14",
                    "#613106"
                ]
            }]
    },
    options: {
        animation:{
            animateScale:true
        }
    }

});
    var ctx = document.getElementById("mmChart");
    var myDoughnutChart = new Chart(ctx, {
    type: 'doughnut',
    data: {
    labels: [
        "C#",
        "Java",
        "Web"
    ],
    datasets: [
        {
            data: [20, 20, 60],
            backgroundColor: [
                "#E8AD14",
                "#D3C75A",
                "#AF2021"
            ],
            hoverBackgroundColor: [
                "#E8AD14",
                "#D3C75A",
                "#AF2021"
            ]
        }]
},
    options: {
        animation:{
            animateScale:true
        }
    }
});
});