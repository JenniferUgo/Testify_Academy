function convertCelsiusToFahrenheit(celsius) {
    const fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
  }
  
  const celsiusTemperature = 32; // the temperature
  const fahrenheitTemperature = convertCelsiusToFahrenheit(celsiusTemperature);
  
  console.log(celsiusTemperature + '°C is approximately equal to ' + fahrenheitTemperature + '°F.');
  
  