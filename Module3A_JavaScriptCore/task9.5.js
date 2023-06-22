function convertCelsiusToFahrenheit(celsius) {
    const fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
  }
  
  const celsiusTemperature = 32; // Enter the temperature in degrees Celsius here
  const fahrenheitTemperature = convertCelsiusToFahrenheit(celsiusTemperature);
  
  console.log(celsiusTemperature + '°C is approximately equal to ' + fahrenheitTemperature + '°F.');
  
  